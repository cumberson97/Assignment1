package com.example.assignment1;

public class  Cake {
    private String cakeType;
    private boolean sliceOrWhole; //True for whole & False for slice

    public Cake(String cakeType){
        this.cakeType = cakeType;
    }

    boolean slice(){
        return this.sliceOrWhole;
    }
    void setSliceOrWhole(boolean value){
        this.sliceOrWhole = value;
    }
}
