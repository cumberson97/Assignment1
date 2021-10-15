package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class ShoppingCart extends AppCompatActivity{

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
    }

    public void goToShop(View view){
        intent = new Intent(ShoppingCart.this, MainActivity.class);
        startActivity(intent);
    }

}