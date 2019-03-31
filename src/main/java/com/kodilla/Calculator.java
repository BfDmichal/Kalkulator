package com.kodilla;

public class Calculator {

    public void addition(){
        System.out.println("Make total");
    }

    public void subtraction(){
        System.out.println("Make difference");
    }
    public static void main(String args[]){
        Calculator cal  = new Calculator();
        cal.addition();
    }
}
