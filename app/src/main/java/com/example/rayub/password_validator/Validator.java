package com.example.rayub.password_validator;

public class Validator {

    private String word;

    public Validator(String word) {
        this.word = word;
    }

    public void setPassword(String word) {
        this.word = word;
    }

    public String getPassword() {
        return this.word;
    }

    public boolean isValid() {
        if (!word.toLowerCase().equals("password")) //make sure password is not "password" (case insensitive)
        {
            return false;
        }

        if (word.length() < 8) //less than 8 characters
        {
            return false;
        }

        //Custom Rules
        if (word.length() > 20) //Custom Rule 1: can't be longer than 20 characters
        {
            return false;
        }

        for (int i = 0; i < word.length(); i++) //Custom Rule 2: can't be a '?'
        {
            if (word.charAt(i) == '?')
            {
                return false;
            }
        }

        for (int i = 0; i < word.length(); i++) //Custom Rule 3: no digits
        {
            if (Character.isDigit(word.charAt(i)))
            {
                return false;
            }
        }

        return true;
    }
}
