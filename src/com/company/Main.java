package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(4, 5);
        System.out.println(calculator.getFirstInt() + " + " + calculator.getSecondInt() + " = " + calculator.plus());
        System.out.println(calculator.getFirstInt() + " - " + calculator.getSecondInt() + " = " +calculator.minus());

    }
}
