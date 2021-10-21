package com.example.assignment1;

import java.io.Serializable;

public class  Cake implements Serializable {
    String cakeType;
    private boolean sliceOrWhole; //True for whole & False for slice
    private boolean icing;
    private boolean sprinkles;
    private boolean caramel;

    public Cake(String cakeType,boolean sliceOrWhole, boolean icing, boolean sprinkles, boolean caramel){
        this.cakeType = cakeType;
        this.sliceOrWhole = sliceOrWhole;
        this.icing = icing;
        this.sprinkles = sprinkles;
        this.caramel = caramel;
    }


    public boolean isSliceOrWhole() {
        return sliceOrWhole;
    }

    public boolean isSprinkles() {
        return sprinkles;
    }

    public boolean isIcing() {
        return icing;
    }

    public boolean isCaramel() {
        return caramel;
    }

    public void setSliceOrWhole(boolean sliceOrWhole) {
        this.sliceOrWhole = sliceOrWhole;
    }

    public void setIcing(boolean icing) {
        this.icing = icing;
    }

    public void setSprinkles(boolean sprinkles) {
        this.sprinkles = sprinkles;
    }

    public void setCaramel(boolean caramel) {
        this.caramel = caramel;
    }

    public String getCakeType() {
        return cakeType;
    }
}
