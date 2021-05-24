package com.example.ontap;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private String gia;
    private int img;

    public Product(String name, String gia, int img) {
        this.name = name;
        this.gia = gia;
        this.img = img;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
