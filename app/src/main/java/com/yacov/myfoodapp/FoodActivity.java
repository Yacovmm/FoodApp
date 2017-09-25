package com.yacov.myfoodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODN0 = "foodn0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        //pegar o food number
        int foodn0 = (Integer) getIntent().getExtras().get(EXTRA_FOODN0);
        //passa o foodnumber no array
        Food food = Food.foods[foodn0];

        TextView name = (TextView) findViewById(R.id.name);
        TextView desc = (TextView) findViewById(R.id.desc);
        ImageView foodimage = (ImageView) findViewById(R.id.foodimage);

        name.setText(food.getName());
        desc.setText(food.getDescription());
        foodimage.setImageResource(food.getImageId());

    }
}
