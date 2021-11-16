package com.example.tosteas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[]labels;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labels= getResources().getStringArray(R.array.labels);
        //labels= res.getStringArray(R.array.labels);
        Toast toast = Toast.makeText(this, "Toast Text",
                Toast.LENGTH_LONG);

        toast.show();
        btn=findViewById(R.id.button);

        // Create the object of AlertDialog Builder class
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);


                builder.setMessage("rtyry");

                builder.setTitle("Alert !");


                builder.setCancelable(false);
                AlertDialog alertDialog= builder.create();
                alertDialog.show();

            }
        });


    }
}