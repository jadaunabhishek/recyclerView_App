package com.example.recyclerview_app;

public class CardItem {
    private int number;
    private String title;

    public CardItem(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}