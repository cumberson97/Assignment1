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
    Intent intent;
    Cake cake;
    Cart cart = new Cart();
    private ImageView cakePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        cart=DataHandler.readToFile(this,cart,"test.dat");
        TextView counter = findViewById(R.id.itemCounter);
        counter.setText((cart.getNumberOfItems() + ""));
    }

    public void goToCart(View view) {
        intent = new Intent(MainActivity.this, ShoppingCart.class);
        intent.putExtra("Cake List", cart);
        startActivity(intent);
    }

    public void addToCart(View view) {
        boolean sliceOrWhole = false, icing = false, sprinkles = false, caramel = false;
        CheckBox checker;
        RadioButton rChecker;
        TextView counter = findViewById(R.id.itemCounter);

        switch (view.getId()) {
            case R.id.cheeseCakeAdd:
                checker = (CheckBox) findViewById(R.id.cheeseIcingBox);
                if (checker.isChecked()) {
                    icing = true;
                }
                checker = (CheckBox) findViewById(R.id.cheeseCaramelBox);
                if (checker.isChecked()) {
                    caramel = true;
                }
                checker = (CheckBox) findViewById(R.id.cheeseSprinklesBox);
                if (checker.isChecked()) {
                    sprinkles = true;
                }
                rChecker = (RadioButton) findViewById(R.id.sliceCheese);
                if (rChecker.isChecked()) {
                    sliceOrWhole = true;
                } else {
                    sliceOrWhole = false;
                }
                cake = new Cake("Cheese Cake", sliceOrWhole, icing, sprinkles, caramel);
                cart.addCake(cake);
                Toast.makeText(this, "Cheese Cake added", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chocoCakeAdd:
                checker = (CheckBox) findViewById(R.id.chocolateIcingBox);
                if (checker.isChecked()) {
                    icing = true;
                }
                checker = (CheckBox) findViewById(R.id.chocolateCarmelBox);
                if (checker.isChecked()) {
                    caramel = true;
                }
                checker = (CheckBox) findViewById(R.id.chocolateSprinklesBox);
                if (checker.isChecked()) {
                    sprinkles = true;
                }
                rChecker = (RadioButton) findViewById(R.id.chocoSlice);
                if (rChecker.isChecked()) {
                    sliceOrWhole = true;
                } else {
                    sliceOrWhole = false;
                }
                cake = new Cake("Chocolate Cake", sliceOrWhole, icing, sprinkles, caramel);
                cart.addCake(cake);
                Toast.makeText(this, "Chocolate Cake added", Toast.LENGTH_SHORT).show();
                break;
            case R.id.spongeCakeAdd:
                checker = (CheckBox) findViewById(R.id.spongeIcingBox);
                if(checker.isChecked()){
                    icing=true;
                }
                checker = (CheckBox) findViewById(R.id.spongeCaramelBox);
                if(checker.isChecked()){
                    caramel=true;
                }
                checker = (CheckBox) findViewById(R.id.spongeSprinklesBox);
                if(checker.isChecked()){
                    sprinkles=true;
                }
                rChecker = (RadioButton) findViewById(R.id.spongeSlice);
                if(rChecker.isChecked()){
                    sliceOrWhole=true;
                }else{
                    sliceOrWhole=false;
                }
                cake = new Cake("Sponge Cake", sliceOrWhole, icing, sprinkles, caramel);
                cart.addCake(cake);
                Toast.makeText(this, "Sponge Cake added", Toast.LENGTH_SHORT).show();
                break;
            case R.id.carrotCakeAdd:
                checker = (CheckBox) findViewById(R.id.carrotIcingBox);
                if(checker.isChecked()){
                    icing=true;
                }
                checker = (CheckBox) findViewById(R.id.carrotCaramelBox);
                if(checker.isChecked()){
                    caramel=true;
                }
                checker = (CheckBox) findViewById(R.id.carrotSprinklesBox);
                if(checker.isChecked()){
                    sprinkles=true;
                }
                rChecker = (RadioButton) findViewById(R.id.carrotSlice);
                if(rChecker.isChecked()){
                    sliceOrWhole=true;
                }else{
                    sliceOrWhole=false;
                }
                cake = new Cake("Carrot Cake", sliceOrWhole, icing, sprinkles, caramel);
                cart.addCake(cake);
                Toast.makeText(this, "Carrot Cake added", Toast.LENGTH_SHORT).show();
                break;
            case R.id.redVelvetAdd:
                checker = (CheckBox) findViewById(R.id.redVelvetIcingBox);
                if(checker.isChecked()){
                    icing=true;
                }
                checker = (CheckBox) findViewById(R.id.redVelvetCaramelBox);
                if(checker.isChecked()){
                    caramel=true;
                }
                checker = (CheckBox) findViewById(R.id.redVelvetSprinklesBox);
                if(checker.isChecked()){
                    sprinkles=true;
                }
                rChecker = (RadioButton) findViewById(R.id.redVelSlice);
                if(rChecker.isChecked()){
                    sliceOrWhole=true;
                }else{
                    sliceOrWhole=false;
                }
                cake = new Cake("Red Velvet Cake", sliceOrWhole, icing, sprinkles, caramel);
                cart.addCake(cake);
                Toast.makeText(this, "Red Velvel Cake added", Toast.LENGTH_SHORT).show();
                break;
        }
        counter.setText((cart.getNumberOfItems() + ""));
        DataHandler.writeToFile(this,cart,"test.dat");
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