package com.epam.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Basic note entity class
 */
@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Note {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String text;

    @NonNull
    @ManyToOne
    private User user;
}
