package com.example.user.project;


public class ListItem {

    private String head;

    private int Image;

    private String Desc;

    private String price;



    String getHead() {
        return head;
    }

    int getImage() {
        return Image;
    }

    String getDesc() {
        return Desc;
    }

    String getPrice() {
        return price;
    }



    public ListItem(String head, int Image, String Desc, String price) {
        this.head = head;
        this.Image = Image;
        this.Desc = Desc;
        this.price = price;
    }



}
