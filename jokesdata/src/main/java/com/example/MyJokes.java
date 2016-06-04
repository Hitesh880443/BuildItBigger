package com.example;

import java.util.Random;

public class MyJokes {



    private String[] jokes;
    private Random random_number;

    public MyJokes() {
        jokes = new String[4];
        jokes[0] = "AAAA A sasas asasasa sasasasas";
        jokes[1] = "afda fd asfds dasfds asfa a";
        jokes[2] = "asfdsf dsf dsfds sdfdsdsf sdf";
        jokes[3] = "rtrt5653454 345345 5 34534 55345345453454";
        random_number = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random_number.nextInt(jokes.length)];
    }
}
