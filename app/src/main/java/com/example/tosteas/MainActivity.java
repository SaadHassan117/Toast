package com.example.tosteas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ArrayList< String> aray;
   ListView obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obj=findViewById(R.id.list);
              aray=new ArrayList<>();
              aray.add ("saad");
              aray.add("hassan");
        ArrayAdapter<String> adaptor=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,aray);
            obj.setAdapter(adaptor);




    }
}