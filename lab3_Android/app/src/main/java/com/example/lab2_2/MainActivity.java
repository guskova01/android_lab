package com.example.lab2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.util.Log;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;


public class MainActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
public void openCamera(View view){
    Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    try {
        startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
    }catch (ActivityNotFoundException e){

    }
}

    EditText input1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Toast mytoast = new Toast(this);
        Toast.makeText(MainActivity.this,
                "OnCreate", Toast.LENGTH_SHORT).show();
        Log.i("AppLogger", "Вызван метод OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startNewActivity(View v){
        input1 = (EditText) findViewById(R.id.editTextTextEmailAddress);
        String name1 = input1.getText().toString();
        Intent intent = new Intent(this, DataListActivity.class);
        intent.putExtra("name", name1);
        startActivity(intent);
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

}