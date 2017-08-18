package com.yavuzoktay.jsonplaceholder;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.yavuzoktay.jsonplaceholder.models.PlaceHolderModel;
import com.yavuzoktay.jsonplaceholder.networks.Factory;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

     TextView textView ;
     RecyclerView recyclerView ;
     SimpleRecyclerAdapter simpleRecyclerAdapter ;
     ArrayList<Person> arrayList ;
     private LinearLayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // textView = (TextView) findViewById(R.id.textView);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        layoutManager = new LinearLayoutManager(getBaseContext());
        layoutManager.scrollToPosition(0);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        arrayList=new ArrayList<Person>();




        Factory.getInstance().placeHolderModel().enqueue(new Callback<List<PlaceHolderModel>>() {
            @Override
            public void onResponse(Call<List<PlaceHolderModel>> call, Response<List<PlaceHolderModel>> response) {
               // textView.setText(response.body().get(0).name);
                simpleRecyclerAdapter= new SimpleRecyclerAdapter(response.body(), MainActivity.this);
                recyclerView.setAdapter(simpleRecyclerAdapter);

            }

            @Override
            public void onFailure(Call<List<PlaceHolderModel>> call, Throwable t) {

            }
        });



    }
}
