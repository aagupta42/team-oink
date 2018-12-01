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

    public static final String TAG_PET = "tag";


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
        double pet = 0.0d;


        switch(v.getId()){
            case R.id.play :
            {
                pet = 1.0d;
                break;
            }
            default:
            {
                break;
            }
        }

        launchNextActivity(pet);

    }

    private void launchNextActivity(double pet)
    {

        Intent NextActivity = new Intent(MainActivity.this, Main2Activity.class);

        NextActivity.putExtra(TAG_PET, pet);

        startActivity(NextActivity);
    }

}
