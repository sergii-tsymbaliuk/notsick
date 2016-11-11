package com.epam.controller;

import com.epam.entity.Note;
import com.epam.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by stsym on 10/27/2016.
 */
@RestController
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService){
        this.noteService = noteService;
    }

    @RequestMapping(path = "/notes", method = RequestMethod.GET)
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @RequestMapping(path = "/note/{id}", method = RequestMethod.GET)
    public Note getNoteById(@PathVariable Long id){
        return noteService.getNoteById(id);
    }

    @RequestMapping(path="/user/{userId}/notes", method = RequestMethod.GET)
    public List<Note> getUserNotes(@PathVariable Long userId){
        return noteService.getNotesByUser(userId);
    }

    @RequestMapping(path="/user/{userId}/note", method = RequestMethod.PUT)
    public Note putNote(@PathVariable Long userId, @ModelAttribute Note note){
        return noteService.saveNote(note);
    }

}
