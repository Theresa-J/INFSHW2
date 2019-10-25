package com.example.infshw2;

public class Menu {
    private int itemId;
    private String name;
    private double cost;
    private String descrip;
    private int imageDrawableId;


    public Menu(int itemId, String name, double cost, String descrip,int imageDrawableId) {
        this.itemId=itemId;
        this.name = name;
        this.cost = cost;
        this.descrip = descrip;
        this.imageDrawableId = imageDrawableId;

    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getImageDrawableId() {

        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {

        this.imageDrawableId = imageDrawableId;
    }
}
