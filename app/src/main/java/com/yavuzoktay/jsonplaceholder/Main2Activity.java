package com.yavuzoktay.jsonplaceholder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.yavuzoktay.jsonplaceholder.models.AlbumsModel;
import com.yavuzoktay.jsonplaceholder.models.PlaceHolderModel;
import com.yavuzoktay.jsonplaceholder.networks.Factory;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {
  //  private TextView textView ;
    private RecyclerView recyclerView;
    private AlbumRecyclerAdapter albumRecyclerAdapter ;
    private ArrayList<Albums> albums;
    private LinearLayoutManager linearLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

      //  textView= (TextView) findViewById(R.id.textView);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerAlbum);

        linearLayoutManager =new LinearLayoutManager(getBaseContext());
        linearLayoutManager.scrollToPosition(0);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        albums=new ArrayList<Albums>();


        Intent intent =getIntent();
        Toast.makeText(this, String.valueOf(intent.getIntExtra("mesaj", 0)), Toast.LENGTH_SHORT).show();
        Factory.getInstance().placeAlbums(intent.getIntExtra("mesaj",0)).enqueue(new Callback<List<AlbumsModel>>() {
            @Override
            public void onResponse(Call<List<AlbumsModel>> call, Response<List<AlbumsModel>> response) {
              //  textView.setText(response.body().get(0).title);
                albumRecyclerAdapter=new AlbumRecyclerAdapter(response.body(),Main2Activity.this);
                recyclerView.setAdapter(albumRecyclerAdapter);
            }

            @Override
            public void onFailure(Call<List<AlbumsModel>> call, Throwable t) {

            }
        });

    }
}
