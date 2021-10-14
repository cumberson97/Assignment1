package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private ImageView cakePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
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