package com.epam.service;

import com.epam.entity.Note;

import java.util.List;

/**
 * Note Service Interface.
 */
public interface NoteService {
    Note getNoteById(Long id);
    List<Note> getAllNotes();
    List<Note> getNotesByUser(Long userId);
    Note saveNote(Note note);
}
