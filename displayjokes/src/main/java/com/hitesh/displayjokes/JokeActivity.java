package com.hitesh.displayjokes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public final static String INTENT_JOKE = "INTENT_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        if (!getIntent().getStringExtra(INTENT_JOKE).isEmpty()) {
            String joke = getIntent().getStringExtra(INTENT_JOKE);
            TextView textViewJoke = (TextView) findViewById(R.id.jokeText);
            textViewJoke.setText(joke);
        }
    }
}
