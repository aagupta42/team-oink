package com.example.luisawatkins.mypetapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Main2Activity extends Activity implements OnClickListener{

    private static final String TAG_DEBUG = Main2Activity.class.getName();
    public static final String TAG_NAME = "tag";

    private EditText et;

    private Button button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et = (EditText) findViewById(R.id.choosename);
        button02 = (Button) findViewById(R.id.create);

        button02.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        double pet = 0.0d;
        switch(v.getId()){
            case R.id.create :
            {
                pet = 1.1d;
                break;
            }
            default :
            {
                break;
            }
        }


        String name = et.getText().toString();

        if(name.equals(""))
        {
            Toast.makeText(Main2Activity.this, "Oops! Make sure to give me a name.", Toast.LENGTH_LONG).show();
            return;
        }

        launchNextActivity(name);
    }

    private void launchNextActivity(String name)
    {
        double pet = getIntent().getExtras().getDouble(MainActivity.TAG_PET);

        Intent nextActivity = new Intent(Main2Activity.this, Main3Activity.class);

        nextActivity.putExtra(TAG_NAME,name);



        startActivity(nextActivity);
    }

}
