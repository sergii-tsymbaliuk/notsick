package com.epam.service;

import com.epam.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;

/**
 * HashMap UserService implementation.
 */
//@Service
public class HashMapNoteServiceImpl implements NoteService {
    private static Long idGenerator = 0L;

    private UserService userService;
    private HashMap<Long, Note> notes;

    @Autowired
    public HashMapNoteServiceImpl(UserService userService) {
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
                .filter(note->note.getUser().getId().equals(userId))
                .collect(Collectors.toList());
    }

    @Override
    public Note saveNote(Note note) {
        if (note.getId() == null){
            note.setId(idGenerator++);
        }
        return notes.put(note.getId(), note);
    }

    @Override
    public Note deleteNote(Note note) {
        return this.notes.remove(note.getId());
    }

    @Override
    public Note deleteNote(Long id) {
        return this.notes.remove(id);
    }
}
