package com.example.ontap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements  itemClick{

    Product product;
    private RecyclerView sRew;
    private  ProductAdapter adt;
    private ArrayList<Product> lsp;
    private ImageButton imgBtnPlus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }
    private void initView() {

        lsp = new ArrayList<>();
        lsp.add(new Product("Matteo Armchair", "$500",R.drawable.img4));
        lsp.add(new Product("Morden Armchair", "$350",R.drawable.img1));
        lsp.add(new Product(" Armchair", "$100",R.drawable.img2));
        lsp.add(new Product("Morden ", "$250",R.drawable.img3));
        sRew = findViewById(R.id.productList);
        sRew.setHasFixedSize(true);
       sRew.setLayoutManager(new GridLayoutManager(this, 2));

        adt = new ProductAdapter(lsp,this,this);
        sRew.setAdapter(adt);


    }
    @Override
    public void itemClick(Product product) {
        Intent intent =new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("Product",product);
        startActivity(intent);
    }


}