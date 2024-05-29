package com.example.tugasaqua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main_undian_evg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mendapatkan_undian_evg);
    }

    public void wheel1(View view) {
        Intent intent = new Intent(Main_undian_evg.this,Mainspinwheel_april.class);
        startActivity(intent );

    }

}