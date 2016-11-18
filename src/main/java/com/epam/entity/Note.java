package com.epam.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Basic note entity class
 */
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Note {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String text;

    @NonNull
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
