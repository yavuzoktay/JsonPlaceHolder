package com.yavuzoktay.jsonplaceholder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yavuzoktay.jsonplaceholder.models.PlaceHolderModel;

import java.util.List;

/**
 * Created by Yavuz on 15.8.2017.
 */

public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView isim ;
        public TextView soyIsim ;
        public CardView cardView ;

        public ViewHolder(View itemView) {
            super(itemView);
            isim = itemView.findViewById(R.id.textIsım);
            soyIsim=itemView.findViewById(R.id.textSoyIsim);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }


    List<PlaceHolderModel> placeHolderModel;
    Context context ;

    public SimpleRecyclerAdapter(List<PlaceHolderModel> placeHolderModel, Context context) {
        this.placeHolderModel = placeHolderModel;
        this.context=context;
    }

    @Override
    public SimpleRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_custom,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return  viewHolder ;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.isim.setText(placeHolderModel.get(position).name);
        holder.soyIsim.setText(placeHolderModel.get(position).username);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //what shall i write
                Intent intent=new Intent(context,Main2Activity.class);
                intent.putExtra("mesaj",placeHolderModel.get(position).id);
                context.startActivity(intent);




            }
        });
    }

    @Override
    public int getItemCount() {
        return placeHolderModel.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }




}
