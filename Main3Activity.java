package com.example.luisawatkins.mypetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;



public class Main3Activity extends AppCompatActivity {

    ImageButton funbutton;
    ImageButton hygienebutton;
    ImageButton hungerbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        funbutton = (ImageButton) findViewById(R.id.fun_button);
        hygienebutton = (ImageButton) findViewById(R.id.hygiene_button);
        hungerbutton = (ImageButton) findViewById(R.id.hunger_button);

        funbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this, "yay!", Toast.LENGTH_LONG).show();
            }
        });

        hygienebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this, "ahhhh that's better", Toast.LENGTH_LONG).show();
            }
        });

        hungerbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this, "yum!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
