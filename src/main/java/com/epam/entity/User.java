package com.epam.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Basic user entity.
 */
@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @GeneratedValue
    @Id
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String login;

    @OneToMany
    private List<Note> notes;
}
