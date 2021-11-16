package com.example.tosteas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[]labels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labels= getResources().getStringArray(R.array.labels);
        //labels= res.getStringArray(R.array.labels);
        Toast toast = Toast.makeText(this, "Toast Text",
                Toast.LENGTH_LONG);

        toast.show();
    }
}