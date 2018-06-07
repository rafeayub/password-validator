package com.example.rayub.password_validator;

public class Validator {

    private String word;

    public Validator(String word){
        this.word = word;
    }

    public void setPassword(String word)
    {
        this.word = word;
    }

     public String getPassword()
     {
        return this.word;
     }

     public boolean isValid()
     {
         if (!word.toLowerCase().equals("password")) //makes sure password is not "password" (case insensitive)
         {
              return false;
         }

         if (word.length() < 8) //less than 8 characters
         {
            return false;
         }

         return true;
     }
}
