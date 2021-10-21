package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView cakePic;
    Intent intent;
    Cake cake;

    Cart cart = new Cart();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }

    public void goToCart(View view) {
        intent = new Intent(MainActivity.this, ShoppingCart.class);
        intent.putExtra("Cake List", cart);
        startActivity(intent);
    }

    public void addToCart(View view) {
        int btn = view.getId();
        boolean sliceOrWhole=false, icing=false, sprinkles=false, caramel=false;
        CheckBox checker;
        RadioButton rChecker;
        TextView counter = findViewById(R.id.itemCounter);
        String text = counter.getText().toString();
        int count = Integer.parseInt(text);
        count++;
        counter.setText((count + ""));

        switch (view.getId()){
            case R.id.cheeseCakeAdd:
                checker = (CheckBox) findViewById(R.id.cheeseIcingBox);
                if(checker.isChecked()){
                    icing=true;
                }
                checker = (CheckBox) findViewById(R.id.cheeseCaramelBox);
                if(checker.isChecked()){
                    caramel=true;
                }
                checker = (CheckBox) findViewById(R.id.cheeseSprinklesBox);
                if(checker.isChecked()){
                    sprinkles=true;
                }
                rChecker = (RadioButton) findViewById(R.id.sliceCheese);
                if(rChecker.isChecked()){
                    sliceOrWhole=true;
                }else{
                    sliceOrWhole=false;
                }
                cake = new Cake("Cheese Cake", sliceOrWhole, icing, sprinkles, caramel);
                cart.addCake(cake);
                Toast.makeText(this, "Cheese Cake added", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chocoCakeAdd:
                Toast.makeText(this, "Chocolate", Toast.LENGTH_SHORT).show();
                break;
            case R.id.spongeCakeAdd:
                Toast.makeText(this, "Sponge", Toast.LENGTH_SHORT).show();
                break;
            case R.id.carrotCakeAdd:
                Toast.makeText(this, "Carrot", Toast.LENGTH_SHORT).show();
                break;
            case R.id.redVelvetAdd:
                Toast.makeText(this, "Red Velvet", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void switchPic(View view) {

        if (view.getId() == R.id.sliceCheese) {
            cakePic = findViewById(R.id.cheese_slice_img);
            cakePic.setImageResource(R.drawable.cheese_slice);
        }
        if (view.getId() == R.id.wholeCheese) {
            cakePic = findViewById(R.id.cheese_slice_img);
            cakePic.setImageResource(R.drawable.wholecheese);
        }
        if (view.getId() == R.id.chocoWhole) {
            cakePic = findViewById(R.id.choco_cake_full);
            cakePic.setImageResource(R.drawable.choc_full);
        }
        if (view.getId() == R.id.chocoSlice) {
            cakePic = findViewById(R.id.choco_cake_full);
            cakePic.setImageResource(R.drawable.choc_slice);
        }
        if (view.getId() == R.id.spongeSlice) {
            cakePic = findViewById(R.id.sponge_full_img);
            cakePic.setImageResource(R.drawable.sponge_slice);
        }
        if (view.getId() == R.id.spongeWhole) {
            cakePic = findViewById(R.id.sponge_full_img);
            cakePic.setImageResource(R.drawable.sponge_full);
        }
        if (view.getId() == R.id.carrotSlice) {
            cakePic = findViewById(R.id.carrotCakeImg);
            cakePic.setImageResource(R.drawable.carrot_cake_slice);
        }
        if (view.getId() == R.id.carrotWhole) {
            cakePic = findViewById(R.id.carrotCakeImg);
            cakePic.setImageResource(R.drawable.carrot_cake);
        }
        if (view.getId() == R.id.redVelSlice) {
            cakePic = findViewById(R.id.redVelvet);
            cakePic.setImageResource(R.drawable.red_velvet_slice);
        }
        if (view.getId() == R.id.redVelWhole) {
            cakePic = findViewById(R.id.redVelvet);
            cakePic.setImageResource(R.drawable.red_velvet);
        }
    }


}