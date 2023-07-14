package com.example.gen;

import com.example.FoodType;

public class Animal {
    
    String name;
    int legs;
    FoodType ft;
    final String species;

    public Animal(String name, int legs, FoodType ft, String s){
        this.name = name;
        this.legs = legs;
        this.ft = ft;
        species = s;
    }

    public Animal(String s){
        species = s;
    }

   
    public String toString(){
        return "name:"+name+ ", legs:"+legs+ ", foodtype:"+ ft;
    }

    public String getName(){
        return name;
        
    }
    
    public int getLegs(){
        return legs;
    }

    public void setName(String n){
        name = n;
    }

    public FoodType getFoodType(){
        return ft;
    }

    public String getSpecies(){
        return species;
    }
}
