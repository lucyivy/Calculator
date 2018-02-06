package com.company;

public class Calculator {
    private Integer firstInt;
    private Integer secondInt;

    public Calculator (Integer firstInt, Integer secondInt) {
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    public Integer plus(){
        return (firstInt + secondInt);
    }

    public Integer minus(){
        return (firstInt - secondInt);
    }

    public Integer getFirstInt() {
        return firstInt;
    }

    public Integer getSecondInt() {
        return secondInt;
    }
}
