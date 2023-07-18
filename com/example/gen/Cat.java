package com.example.gen;

import com.example.gen.FoodType;

public class Cat extends Animal {
    
    public Cat(String n, int l, FoodType f, String s){
        super(n, l, f, "Felis");
    }

    public Cat(){
        super();
        //super("Felis");
    }

    String speak(){
        return "myawoo";
    }
    
}
