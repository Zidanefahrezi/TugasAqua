package com.example.tugasaqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mainregister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void backlogin (View view) {
        Intent intent = new Intent(Mainregister.this,Mainlogin.class);
        startActivity(intent );

    }

    public void mainberanda (View view) {
        Intent intent = new Intent(Mainregister.this,MainBerandaUtama.class);
        startActivity(intent );

    }
}