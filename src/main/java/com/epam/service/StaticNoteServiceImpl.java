package com.epam.service;

import com.epam.entity.Note;
import com.epam.entity.notes.TextNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stsym on 10/26/2016.
 */
@Component
public class StaticNoteServiceImpl implements NoteService {
    @Autowired
    private UserService userService;

    private List<Note> notes;

    public StaticNoteServiceImpl() {
        this.notes = new ArrayList<Note>();
        this.notes.add(new TextNote(userService.getById(1L), "Some text"));
        this.notes.add(new TextNote(userService.getById(2L), "Some text 2"));
    }

    @Override
    public Note getNoteById(Long id) {
        return notes.stream()
                    .filter(note->(note.getId()==id))
                    .findFirst()
                    .get();
    }

    @Override
    public List<Note> getAllNotes() {
        return null;
    }

    @Override
    public List<Note> getNotesByUser(Long userId) {
        return null;
    }
}
