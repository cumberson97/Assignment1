package com.example.assignment1;
import java.util.ArrayList;

public class Cart implements java.io.Serializable {
    private ArrayList<Cake> cakes;
    private int numberOfItems;

    public Cart(){
        cakes = new ArrayList<Cake>();
        numberOfItems = 0;
    }

    public int noOfItems(){
        return numberOfItems;
    }

    public void  addCake(Cake cake){
        cakes.add(cake);
        numberOfItems++;
    }

    public void deleteCake(Cake cake){
        cakes.remove(cake);
    }

    public void clearCart(){
        cakes.clear();
    }

    public ArrayList<Cake> getCakes(){
        return cakes;
    }

}
