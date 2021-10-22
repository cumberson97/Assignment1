package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
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

public class ShoppingCart extends AppCompatActivity {
    ListView listView;
    Intent intent;
    Cart cart;
    String items = "";
    ArrayList<Cake> cakes = new ArrayList<>();
    ArrayList<Cart> oldCarts = new ArrayList<>();
    int oldCartCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
        TextView textView = (TextView) findViewById(R.id.textList);
        cart = (Cart) getIntent().getSerializableExtra("Cake List");
        if (cart.getCakes().isEmpty()) {
            textView.setText("Your cart is empty!");
        } else {
            cakes = cart.getCakes();
            textView.setText(cart.listCakes());
        }
        oldCarts = DataHandler.readToFileAL(this, oldCarts, "oldCarts.dat");
    }

    public void goToShop(View view) {
        intent = new Intent(ShoppingCart.this, MainActivity.class);
        startActivity(intent);
    }

    public void completeOrder(View view) {
        Button btn = findViewById(R.id.sendOrder);
        btn.setVisibility(View.VISIBLE);
    }


    public void sendOrder(View view) {
        if(cart.isEmpty()){
            Toast.makeText(this, "Cart Empty", Toast.LENGTH_SHORT).show();
        }
        else{

            Toast.makeText(this, "Order Sent", Toast.LENGTH_SHORT).show();
            oldCarts.add(cart);
            DataHandler.writeToFileAL(this, oldCarts, "oldCarts.dat");
            cart.getCakes().clear();
            TextView textView = findViewById(R.id.textList);
            textView.setText("Your cart is empty!");
            DataHandler.delete(this, "test.dat");
        }

    }

    public void displayOrder(View view) {
        oldCarts = DataHandler.readToFileAL(this, oldCarts, "oldCarts.dat");
        String orders = "";
        int count = 1;
        for (Cart x : oldCarts){
            orders+=count + "\n";
            orders+=x.listCakes() + "\n\n";
            count++;
        }
        TextView textView = findViewById(R.id.oldOrders);
        textView.setText(orders);
    }

}