package com.example.gestion_hotel;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter_h extends RecyclerView.Adapter<adapter_h.ViewHolder> {
    List<String>hotl;
    List<Integer>img_h,img_s;
    Context ctx;
    LayoutInflater inflater;

    public adapter_h(Context ctx , List<String>hotl,List<Integer> img_h,List<Integer> img_s){
        this.hotl= hotl;
        this.img_h=img_h;
        this.img_s=img_s;
        this.ctx = ctx;
      //  this.inflater= LayoutInflater.from(ctx);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = inflater.from(ctx).inflate(R.layout.hoetl_element,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.hot_name.setText(hotl.get(position));
        holder.img.setImageResource(img_h.get(position));
        holder.scal.setImageResource(img_s.get(position));
        String k =hotl.get(position);
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx,cat_chambre.class);
                i.putExtra("keyy",k);
                ctx.startActivity(i);
            }
        });

    }



    @Override
    public int getItemCount() {
        return hotl.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView hot_name;
        ImageView img,scal;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            scal=itemView.findViewById(R.id.scal);
            hot_name= itemView.findViewById(R.id.txthot);
            img =itemView.findViewById(R.id.imghot);
        }
    }
}
