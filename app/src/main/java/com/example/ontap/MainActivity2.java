package com.example.ontap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageButton btnMinus;
    Product product;
    TextView  tv_Name,tv_Gia;
    ImageView img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // đổi tên các img, textview trong mainacivity2


         img2 = findViewById(R.id.img2);
         tv_Name= findViewById(R.id.tvName2);
         tv_Gia = findViewById(R.id.tvGia2);


        Intent intent = getIntent();

        if(intent !=null){
            product = (Product) intent.getSerializableExtra("Product");
            img2.setImageResource(product.getImg());
            tv_Name.setText(product.getName());
            tv_Gia.setText(product.getGia());

        }

    }
}