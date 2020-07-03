package com.suek.retrofit_market_practice0630;

public class BoardItems {
    int no;
    String name;
    String title;
    String msg;
    String price;
    String file;
    int fav;
    String date;

    public BoardItems() {
    }


    public BoardItems(int no, String name, String title, String msg, String price, String file, int fav, String date) {
        this.no = no;
        this.name = name;
        this.title = title;
        this.msg = msg;
        this.price = price;
        this.file = file;
        this.fav = fav;
        this.date = date;
    }
}
