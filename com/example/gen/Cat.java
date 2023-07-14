package com.example.gen;

import com.example.FoodType;

public class Cat extends Animal {
    
    public Cat(String n, int l, FoodType f, String s){
        super(n, l, f, "Felis");
    }

    public Cat(){
        super("Felis");
    }

    String speak(){
        return "myawoo";
    }
    
}
