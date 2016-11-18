package com.epam.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Basic user entity.
 */
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String login;

    @OneToMany
    private List<Note> notes;
}
