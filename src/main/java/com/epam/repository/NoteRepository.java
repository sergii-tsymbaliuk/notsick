package com.epam.repository;

import com.epam.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by stsym on 11/11/2016.
 */
@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
}
