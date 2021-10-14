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

    public void switchPic(View view){

        if (view.getId()==R.id.sliceCheese){
           cakePic = findViewById(R.id.cheese_slice_img);
           cakePic.setImageResource(R.drawable.choc_full);
        }if(view.getId()==R.id.wholeCheese){
            cakePic = findViewById(R.id.cheese_slice_img);
            cakePic.setImageResource(R.drawable.cheese_slice);
        }
    }



}