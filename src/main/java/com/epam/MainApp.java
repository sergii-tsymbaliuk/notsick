package com.epam;

import com.epam.entity.Note;
import com.epam.entity.User;
import com.epam.repository.NoteRepository;
import com.epam.repository.UserRepository;
import com.epam.service.NoteService;
import com.epam.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan
@Slf4j
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MainApp.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

    @Bean
    public CommandLineRunner demo(UserService userService, NoteService noteService) {
        return (args) -> {
            // save a couple of customers
            userService.saveUser(new User("User", "user"));
            userService.saveUser(new User("Admin", "admin"));

            // fetch all customers
            log.info("-- Users -----------------------------");
            for (User user : userService.getAllUsers()) {
                log.info(user.toString());
                noteService.saveNote(new Note("Note#1 for user " + user.getName(), user));
                noteService.saveNote(new Note("Note#2 for user " + user.getName(), user));
            }

            log.info("--- Notes -----------------------------------------");
            for (Note note : noteService.getAllNotes()) {
                log.info(note.toString());
            }
        };
    }

}