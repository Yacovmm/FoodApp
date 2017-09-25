package com.yacov.myfoodapp;

/**
 * Created by YacovR on 19-Sep-17.
 */

public class Food {

    private String name;
    private String description;
    private int imageId;

    public static final Food [] foods = {

            new Food("Pizza", " Thin crust pizza with extra cheese", R.drawable.pizzaone),
            new Food("Burger", " Veg burger with healthy stuff", R.drawable.burgerone),
            new Food("Sandwich", "Whole wheat sandwich", R.drawable.sandwichone),
    };
    //constructor
    public Food(String name, String description, int imageId){
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return this.name;
    }

    public int getImageId(){
        return imageId;
    }
}
