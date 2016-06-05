package com.example.Vishal.myapplication.backend;

import com.example.MyJokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {
    private  MyJokes myjokes;

    public MyBean() {
        myjokes=new MyJokes();
    }
    public  String getJoke() {
        return myjokes.getRandomJoke();
    }


    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

}