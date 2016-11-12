package com.epam.controller;

import com.epam.entity.Note;
import com.epam.service.NoteService;
import com.epam.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest controller for notes.
 */
@RestController
@Slf4j
public class NoteController {
    @Autowired
    private NoteService noteService;
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/notes", method = RequestMethod.GET)
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @RequestMapping(path = "/notes/{id}", method = RequestMethod.GET)
    public Note getNoteById(@PathVariable Long id){
        return noteService.getNoteById(id);
    }

    @RequestMapping(path="/users/{userId}/notes", method = RequestMethod.GET)
    public List<Note> getUserNotes(@PathVariable Long userId){
        return noteService.getNotesByUser(userId);
    }

    @RequestMapping(path="/users/{userId}/notes", method = {RequestMethod.POST, RequestMethod.PUT})
    public Note addUserNote(@PathVariable Long userId, @ModelAttribute Note note) {
        note.setUser(userService.getUserById(userId));
        return noteService.saveNote(note);
    }
}
