package com.yavuzoktay.jsonplaceholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.yavuzoktay.jsonplaceholder.models.PhotosModel;
import com.yavuzoktay.jsonplaceholder.networks.Factory;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main3Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private  PhotoRecyclerAdapter photoRecyclerAdapter ;
    private ArrayList<Photos> photos;
 //   private LinearLayoutManager linearLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView= (RecyclerView) findViewById(R.id.recyclerPhoto);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

//        linearLayoutManager=new LinearLayoutManager(getBaseContext()) ;
//        linearLayoutManager.scrollToPosition(0);
//        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(linearLayoutManager);
        photos=new ArrayList<Photos>();


        Intent intent=getIntent();
        Toast.makeText(this,String.valueOf(intent.getIntExtra("album",0)), Toast.LENGTH_SHORT).show();
        Factory.getInstance().placePhotos(intent.getIntExtra("album",0)).enqueue(new Callback<List<PhotosModel>>() {
            @Override
            public void onResponse(Call<List<PhotosModel>> call, Response<List<PhotosModel>> response) {
            //    textPhoto.setText(response.body().get(0).title);
                photoRecyclerAdapter=new PhotoRecyclerAdapter(response.body(),Main3Activity.this);
                recyclerView.setAdapter(photoRecyclerAdapter);
            }

            @Override
            public void onFailure(Call<List<PhotosModel>> call, Throwable t) {

            }
        });


    }
}
