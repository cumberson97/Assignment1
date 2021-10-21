package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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
    String items = "";
    ArrayList<Cake> cakes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
        TextView textView = (TextView) findViewById(R.id.textList);
        cart = (Cart) getIntent().getSerializableExtra("Cake List");
        cakes = cart.getCakes();
        textView.setText(cart.listCakes());
    }

    public void goToShop(View view){
        intent = new Intent(ShoppingCart.this, MainActivity.class);
        startActivity(intent);
//        Toast.makeText(this, cart.toString(), Toast.LENGTH_LONG).show();
    }

}