package com.example.ontap;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>  {

    ArrayList<Product> lsProduct;
    itemClick listener;
    Context context;

    public ProductAdapter(ArrayList<Product> lsProduct, itemClick listener, Context context) {
        this.lsProduct = lsProduct;
        this.listener = listener;
        this.context = context;
    }

    public ProductAdapter(ArrayList<Product> lsProduct) {
        this.lsProduct = lsProduct;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycelview,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product products = lsProduct.get(position);
        holder.product = lsProduct.get(position);
        holder.img.setImageResource(products.getImg());
        holder.tvGia.setText(products.getGia());
        holder.tvName.setText(products.getName());
    }

    @Override
    public int getItemCount() {
        return lsProduct.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img ;
        TextView tvName;
        TextView tvGia;
        ImageButton imgBtnPlus;
        Product product;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            tvGia = itemView.findViewById(R.id.tvGia);
            tvName = itemView.findViewById((R.id.tvName));
            imgBtnPlus = itemView.findViewById(R.id.imgBtnPlus);
            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                listener.itemClick(product);
//                   Intent intent = new Intent(context, MainActivity2.class);

//                    intent.putExtra("img",img.getId());
//                    intent.putExtra("tvName",tvName.getText());
//                    intent.putExtra("tvGia",tvGia.getText());

                    //context.startActivity(intent);
               }
            });
        }
    }
}
