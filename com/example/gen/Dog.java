package com.example.gen;

import com.example.FoodType;

public class Dog extends Animal {

    String type;

    public Dog(String n, int l, FoodType f){
        super(n, l, f, "canis");
    }

    public Dog(String n, int l, FoodType f, String t){
        super(n, l, f, "canis");
        type = t;
    }

    String speak(){
        return "boww";
    }

    public String getType(){
        return type;
    }

}
