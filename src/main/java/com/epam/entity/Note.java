package com.epam.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Basic note entity class
 */
@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue
    private Long id;

    private Long userId;
    private String text;

    public Note(Long userId, String text) {
        this.userId = userId;
        this.text = text;
    }
}
