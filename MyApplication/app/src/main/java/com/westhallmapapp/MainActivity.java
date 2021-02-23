package com.westhallmapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.b1f);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i(TAG, "Switching to First Floor page");
                Intent intent = new Intent(MainActivity.this, FirstFloorActivity.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.b2f);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i(TAG, "Switching to Second Floor page");
                Intent intent = new Intent(MainActivity.this, SecondFloorActivity.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.b3f);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i(TAG, "Switching to Third Floor page");
                Intent intent = new Intent(MainActivity.this, ThirdFloorActivity.class);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.b4cm);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i(TAG, "Switching to Campus Map page");
                Intent intent = new Intent(MainActivity.this, CampusMapActivity.class);
                startActivity(intent);
            }
        });

        Button btn5 = findViewById(R.id.b5about);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.i(TAG, "Switching to About page");
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}
