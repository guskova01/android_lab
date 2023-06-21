package com.example.lab2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.content.Context;
import androidx.annotation.Nullable;


public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE); //подключаемся к sharedpreferences


        Toast mytoast = new Toast(this);
        Toast.makeText(MainActivity.this,
                "OnCreate", Toast.LENGTH_SHORT).show();
        Log.i("AppLogger", "Вызван метод OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startNewActivity(View v){
        //вызывается при нажатии

        input1 = (EditText) findViewById(R.id.editTextTextEmailAddress); //подключаемся к полю email
        String name1 = input1.getText().toString(); //берём оттуда текст
        SharedPreferences.Editor editor = sharedPreferences.edit(); //открываем эдитор sharedpreferences
        editor.putString("mail", name1); //записываем туда текст под именем mail
        editor.apply(); //сохраняем текст в sharedpreferences
        Intent intent = new Intent(this, DataListActivity.class);
        startActivity(intent); //запускаем новую активити
    }

    @Override
    protected void onStart() {
        Toast mytoast = new Toast(this);
        Toast.makeText(MainActivity.this,
                "OnStart", Toast.LENGTH_SHORT).show();
        Log.i("AppLogger", "Вызван метод OnStart");
        super.onStart();
    }

    @Override
    protected void onResume() {

        Toast mytoast = new Toast(this);
        Toast.makeText(MainActivity.this,
                "OnResume", Toast.LENGTH_SHORT).show();
        Log.i("AppLogger", "Вызван метод OnResume");
        super.onResume();

    }

    @Override
    protected void onPause() {

        Toast mytoast = new Toast(this);
        Toast.makeText(MainActivity.this,
                "OnPause", Toast.LENGTH_SHORT).show();
        Log.i("AppLogger", "Вызван метод OnPause");
        super.onPause();

    }

    @Override
    protected void onStop() {
        Toast mytoast = new Toast(this);
        Toast.makeText(MainActivity.this,
                "OnStop", Toast.LENGTH_SHORT).show();
        Log.i("AppLogger", "Вызван метод OnStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast mytoast = new Toast(this);
        Toast.makeText(MainActivity.this,
                "OnDestroy", Toast.LENGTH_SHORT).show();
        Log.i("AppLogger", "Вызван метод OnDestroy");
        super.onDestroy();
    }

    public void download(View view) {
        //вызывается при нажатии на insert

        sharedPreferences = getSharedPreferences("myPrefs", Context.MODE_PRIVATE); //подключ к sharedpreferences
        input2 = (EditText) findViewById(R.id.editTextTextEmailAddress);
        String saved = sharedPreferences.getString("mail", null);
        input2.setText(saved);

    }

}