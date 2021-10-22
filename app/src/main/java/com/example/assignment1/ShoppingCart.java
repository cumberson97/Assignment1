package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class ShoppingCart extends AppCompatActivity{
    ListView listView;
    Intent intent;
    Cart cart;
    Cart[] oldOrders = new Cart[50];
    String items = "";
    ArrayList<Cake> cakes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
        TextView textView = (TextView) findViewById(R.id.textList);
        cart = (Cart) getIntent().getSerializableExtra("Cake List");
        if (cart.getCakes().isEmpty()){
            textView.setText("Your cart is empty!");
        }
        else{
            cakes = cart.getCakes();
            textView.setText(cart.listCakes());
        }

    }

    public void goToShop(View view){
        intent = new Intent(ShoppingCart.this, MainActivity.class);
        startActivity(intent);
//        Toast.makeText(this, cart.toString(), Toast.LENGTH_LONG).show();
    }

    public void completeOrder(View view){
        Button btn = findViewById(R.id.sendOrder);
        btn.setVisibility(View.VISIBLE);
    }

    public void sendOrder(View view){
        Toast.makeText(this, "Order Sent", Toast.LENGTH_SHORT).show();
        cart.getCakes().clear();
        TextView textView = findViewById(R.id.textList);
        textView.setText("Your cart is empty!");
        DataHandler.delete(this,"test.dat");

    }

}