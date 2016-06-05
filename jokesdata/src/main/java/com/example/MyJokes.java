package com.example;

import java.util.Random;

public class MyJokes {



    private String[] jokes;
    private Random random_number;

    public MyJokes() {
        jokes = new String[4];
        jokes[0] = "aaaaaaaaaaa";
        jokes[1] = "bbbbbbbbbbbbbbbb";
        jokes[2] = "ccccccccccc";
        jokes[3] = "ddddddddddddddddd";
        random_number = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random_number.nextInt(jokes.length)];
    }
}
