package com.epam.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Basic user entity.
 */
@Entity
@Data
public class User {
    @GeneratedValue
    @Id
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String login;
}
