package com.example.assignment1;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DataHandler {

    public static void writeToFile(Context context, Cart cart, String filename) {
        FileOutputStream ft;
        ObjectOutputStream Ob;
        try {
            ft = context.openFileOutput(filename, Context.MODE_PRIVATE);
            Ob = new ObjectOutputStream(ft);
            Ob.writeObject(cart);
        } catch (Exception c) {
            System.out.println(c);
        }
    }

    public static void writeToFileAL(Context context, ArrayList<Cart> oldCarts, String filename){
        FileOutputStream ft;
        ObjectOutputStream Ob;
        try {
            ft = context.openFileOutput(filename, Context.MODE_PRIVATE);
            Ob = new ObjectOutputStream(ft);
            Ob.writeObject(oldCarts);
        } catch (Exception c) {
            System.out.println(c);
        }
    }

    public static ArrayList<Cart> readToFileAL(Context context, ArrayList<Cart> oldCarts, String filename){
        FileInputStream ft;
        ObjectInputStream Ob;
        try {
            ft = context.openFileInput(filename);
            Ob = new ObjectInputStream(ft);
            oldCarts = (ArrayList<Cart>) Ob.readObject();
            return oldCarts;
        } catch (Exception c) {
            System.out.println(c);
        }
        return oldCarts;
    }

    public static void delete(Context context, String filename) {
        context.deleteFile(filename);
    }

    public static Cart readToFile(Context context, Cart cart, String filename) {
        FileInputStream ft;
        ObjectInputStream Ob;
        try {
            ft = context.openFileInput(filename);
            Ob = new ObjectInputStream(ft);
            cart = (Cart) Ob.readObject();
            return cart;
        } catch (Exception c) {
            System.out.println(c);
        }
        return cart;
    }
}
