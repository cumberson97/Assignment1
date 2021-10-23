package com.example.assignment1;
import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable {
    private ArrayList<Cake> cakes;
    private int numberOfItems;

    public Cart(){
        cakes = new ArrayList<Cake>();
        numberOfItems = 0;
    }

    public void addCake(Cake cake){
        cakes.add(cake);
        numberOfItems++;
    }

    public boolean isEmpty(){
        if(cakes.isEmpty()){
            return true;
        }
        else{
            return false;
        }
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

    public int getNumberOfItems() {
        return numberOfItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cakes=" + cakes +
                ", numberOfItems=" + numberOfItems +
                '}';
    }

    public String listCakes(){
        String allCakes = "";

        for(Cake x : cakes){
            allCakes+=x.getCakeType() + ":\t\t";
            if(x.isSliceOrWhole()){
                allCakes+="\nType: Sliced\t\t";
            }
            else{
                allCakes+="\nType: Whole\t\t";
            }
            if(x.isIcing()||x.isSprinkles()|| x.isCaramel()){
                allCakes+="\nToppings: ";
                if(x.isIcing()){
                    allCakes+="Icing\t\t";
                }
                if(x.isCaramel()){
                    allCakes+="Caramel\t\t";
                }
                if(x.isSprinkles()){
                    allCakes+="Sprinkles\t\t";
                }
            }
            else{
                allCakes+="\nNo Toppings!";
            }

            allCakes+="\n\n";
        }

        return allCakes;
    }
}
