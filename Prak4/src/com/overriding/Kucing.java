package com.overriding;

public class Kucing extends hewan{

    @Override 
    void suara() {
        System.out.println("Kucing berkata: Meong");
    }
} 
