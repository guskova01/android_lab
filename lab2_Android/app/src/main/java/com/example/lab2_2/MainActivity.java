package com.example.lab2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startNewActivity(View v){
        Intent intent = new Intent(this, DataListActivity.class);
        startActivity(intent);
    }

}