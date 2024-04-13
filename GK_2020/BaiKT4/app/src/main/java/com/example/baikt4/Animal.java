package com.example.baikt4;

public class Animal {
    String Image, ten, detail;

    public Animal(String ten, String detail,String image) {
        Image = image;
        this.ten = ten;
        this.detail = detail;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
