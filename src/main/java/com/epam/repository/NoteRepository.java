package com.epam.repository;

import com.epam.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.BaseStream;

/**
 * Created by stsym on 11/11/2016.
 */
@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
    List<Note> findByUserId(Long userId);
}
