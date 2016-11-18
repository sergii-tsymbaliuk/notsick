package com.epam.service;

import com.epam.entity.Note;
import com.epam.repository.NoteRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * CRUD Repository for Notes.
 */
@Data
@Service
public class JpaNoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findOne(id);
    }

    @Override
    public List<Note> getAllNotes() {
        return StreamSupport.stream(noteRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public List<Note> getNotesByUser(Long userId) {
        return noteRepository.findByUserId(userId);
    }

    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note deleteNote(Note note) {
        note = getNoteById(note.getId());
        noteRepository.delete(note);
        return note;
    }

    @Override
    public Note deleteNote(Long id) {
        Note note = noteRepository.findOne(id);
        noteRepository.delete(id);
        return note;
    }
}
