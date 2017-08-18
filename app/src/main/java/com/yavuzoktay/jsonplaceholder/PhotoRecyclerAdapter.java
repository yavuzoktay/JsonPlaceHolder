package com.yavuzoktay.jsonplaceholder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.yavuzoktay.jsonplaceholder.models.PhotosModel;

import java.util.List;

/**
 * Created by Yavuz on 17.8.2017.
 */

public class PhotoRecyclerAdapter extends RecyclerView.Adapter<PhotoRecyclerAdapter.ViewHolder> {
    static ImageView imageView;

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView textItem;
        private CardView cardView ;


        public ViewHolder(View itemView) {
            super(itemView);
            textItem=itemView.findViewById(R.id.textPhotoTitle);
            cardView=itemView.findViewById(R.id.cardPhoto);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
    List<PhotosModel> photosModels ;
    Context context ;

    public PhotoRecyclerAdapter(List<PhotosModel> photosModels, Context context) {
        this.photosModels = photosModels;
        this.context = context;
    }

    @Override
    public PhotoRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.photos_custom,parent,false);
        ViewHolder viewHolder  =new ViewHolder(v);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.textItem.setText(photosModels.get(position).title);
      //  holder.imageView.setImageResource(Integer.parseInt(photosModels.get(position).url));
        Picasso.with(context).load(photosModels.get(position).url).into(imageView);
//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(context,Main4Activity.class);
//                intent.putExtra("photo",photosModels.get(position).url);
//                context.startActivity(intent);
//
//            }
//        });


    }

    @Override
    public int getItemCount() {
        return photosModels.size();
    }
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
