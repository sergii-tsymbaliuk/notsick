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
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Note getNoteById(@PathVariable Long id){
        return noteService.getNoteById(id);
    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public Note addUserNote(@ModelAttribute Note note) {
        return noteService.saveNote(note);
    }
}
