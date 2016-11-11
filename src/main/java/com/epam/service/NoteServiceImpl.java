package com.epam.service;

import com.epam.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;

/**
 * HashMap UserService implementation.
 */
@Component
public class NoteServiceImpl implements NoteService {
    private static Long idGenerator = 0L;

    private UserService userService;
    private HashMap<Long, Note> notes;

    @Autowired
    public NoteServiceImpl(UserService userService) {
        this.userService = userService;
        notes = new HashMap<>();
    }

    @Override
    public Note getNoteById(Long id) {
        return notes.get(id);
    }

    @Override
    public List<Note> getAllNotes() {
        return notes.values()
                .stream()
                .collect(Collectors.toList());
    }

    @Override
    public List<Note> getNotesByUser(Long userId) {
        return notes.values()
                .stream()
                .filter(note->note.getUserId().equals(userId))
                .collect(Collectors.toList());
    }

    @Override
    public Note saveNote(Note note) {
        if (note.getId() == null){
            note.setId(idGenerator++);
        }
        return notes.put(note.getId(), note);
    }

    @PostConstruct
    public void init(){
        saveNote(new Note(0L, "Note 0 for the user 0"));
        saveNote(new Note(1L, "First note for user #1"));
    }
}
