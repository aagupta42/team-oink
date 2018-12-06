package com.example.luisawatkins.mypetapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    private Button button01;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button01 = (Button) findViewById(R.id.play);

        button01.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {



       // launchNextActivity();

    }
/*
    private void launchNextActivity()
    {

        Intent NextActivity = new Intent(MainActivity.this, Main2Activity.class);


        startActivity(NextActivity);
    }
*/
}
