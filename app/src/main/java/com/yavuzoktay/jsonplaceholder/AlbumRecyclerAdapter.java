package com.yavuzoktay.jsonplaceholder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yavuzoktay.jsonplaceholder.models.AlbumsModel;

import java.util.List;

/**
 * Created by Yavuz on 17.8.2017.
 */

public class AlbumRecyclerAdapter extends RecyclerView.Adapter<AlbumRecyclerAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView title ;
        public CardView cardView ;


        public ViewHolder(View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.textAlbum) ;
            cardView = itemView.findViewById(R.id.cardAlbum);

        }
    }

    List<AlbumsModel> albumsModels ;
    Context context ;

    public AlbumRecyclerAdapter(List<AlbumsModel> albumsModels, Context context) {
        this.albumsModels = albumsModels;
        this.context = context;
    }

    @Override
    public AlbumRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_custom,parent,false);
        ViewHolder viewHolder = new ViewHolder(v) ;
        return  viewHolder ;


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.title.setText(albumsModels.get(position).title);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,Main3Activity.class);
                intent.putExtra("album",albumsModels.get(position).id);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
      return  albumsModels.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }



}
