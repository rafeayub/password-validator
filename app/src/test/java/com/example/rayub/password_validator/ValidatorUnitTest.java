package com.example.rayub.password_validator;

import org.junit.Test;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidatorUnitTest
{
    static String word = "password123";

    static Validator validator;

    @BeforeClass
    public static void init()
    {
        validator = new Validator(word);
    }

    @Test
    public void passwordIsCorrect()
    {
        assertEquals(word, validator.getPassword());
    }

}