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
}
