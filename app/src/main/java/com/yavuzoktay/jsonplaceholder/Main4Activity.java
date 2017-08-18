package com.yavuzoktay.jsonplaceholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent=getIntent();
        Toast.makeText(this,String.valueOf(intent.getIntExtra("photo",0)), Toast.LENGTH_SHORT).show();




    }
}
