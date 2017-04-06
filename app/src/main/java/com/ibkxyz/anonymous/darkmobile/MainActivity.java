package com.ibkxyz.anonymous.darkmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /** Called when the user taps the Go button */
    public void login(View view) {
        // Do something in response to button Go

//        Intent intent = new Intent(this, Main2Activity.class);
        EditText passCode = (EditText) findViewById(R.id.editTextLogin);
        if (passCode.getText().equals("1010")){


        }
//        intent.putExtra(EXTRA_MESSAGE, passCode);
//        startActivity(intent);




    }
}
