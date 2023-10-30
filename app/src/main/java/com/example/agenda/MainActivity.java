package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button guardar = findViewById(R.id.button);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                public abstract FileOutputStream openFileOutput (String name,int mode);

                }
        });
    }
}