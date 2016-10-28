package com.epam.entity.notes;

import com.epam.entity.Note;
import com.epam.entity.User;

/**
 * Created by stsym on 10/26/2016.
<<<<<<< HEAD
 *
 *
=======
>>>>>>> 79ff8904382d479804492f54efcc2f5d7f082888
 */
public class TextNote extends Note {
    private String text;

    public TextNote(User user, String text) {
        super(user);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return '{' + super.toString() +
                ", text='" + text + '\'' +
                '}';
    }
}
