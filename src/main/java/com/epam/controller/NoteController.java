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

    public NoteController(@Autowired NoteService noteService){
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
<<<<<<< HEAD
        return noteService.saveNote(note);
=======
        return noteService.putNote(Note,)
>>>>>>> 79ff8904382d479804492f54efcc2f5d7f082888
    }

}
