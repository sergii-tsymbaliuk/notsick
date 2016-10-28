package com.epam.service;

import com.epam.entity.Note;
import com.epam.entity.notes.TextNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
import java.util.stream.Collectors;
=======
>>>>>>> 79ff8904382d479804492f54efcc2f5d7f082888

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
<<<<<<< HEAD
        return notes;
=======
        return null;
>>>>>>> 79ff8904382d479804492f54efcc2f5d7f082888
    }

    @Override
    public List<Note> getNotesByUser(Long userId) {
<<<<<<< HEAD
        return notes.stream()
                    .filter(note->(note.getUser().getId()==userId))
                    .collect(Collectors.toList());
    }

    @Override
    public Note saveNote(Note note) {
        notes.add(note);
        return note;
=======
        return null;
>>>>>>> 79ff8904382d479804492f54efcc2f5d7f082888
    }
}
