package com.esatgozcu.sharedprefcleardata;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.clear);

        sharedPreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        editor.putString("key1","apple");
        editor.putString("key2","banana");
        editor.putString("key3","strawberry");
        editor.apply();
    }

    public void clear(View view){

        editor.clear();
        editor.apply();

    }
}
