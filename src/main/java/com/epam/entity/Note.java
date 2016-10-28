package com.epam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

/**
 * Created by stsym on 10/26/2016.
 */
@Entity
public abstract class Note {
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    public Note(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", user=" + user +
                '}';
    }
}
