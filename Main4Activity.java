package com.example.luisawatkins.mypetapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main4Activity extends Activity implements OnClickListener {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button = (Button) findViewById(R.id.restart);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

        //launchNextActivity();

    }
/*
    private void launchNextActivity()
    {

        Intent NextActivity = new Intent(Main4Activity.this, MainActivity.class);

        startActivity(NextActivity);
    }
   */
}
