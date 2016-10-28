package com.epam.service;

import com.epam.entity.Note;

import java.util.List;

/**
 * Created by stsym on 10/26/2016.
 */
public interface NoteService {
    Note getNoteById(Long id);
    List<Note> getAllNotes();
    List<Note> getNotesByUser(Long userId);
<<<<<<< HEAD

    Note saveNote(Note note);
=======
>>>>>>> 79ff8904382d479804492f54efcc2f5d7f082888
}
