package com.example;

import com.example.gen.Animal;
import com.example.gen.Cat;
import com.example.gen.Dog;

public class First {

    //byte a2b2 = 255; 
    //char ch1;  
    short i1 =  129; 
    //float f1; 16 bits Mantizza, 16 bits for fraction 2.4
    //double db1; 32 bits
    //String str = "hello"; 
    char c1 = 97;


    public static void main(String[] args){
        First f1 = new First();
        Animal.species = "Fourlegs";
        Cat c = new Cat();
        System.out.println("cat species: "+ c.species );
        Dog d = new Dog();
        System.out.println("dog species: "+d.species);
        System.out.println("from animal: "+Animal.species);
    }

}
