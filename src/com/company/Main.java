package com.company;

public class Main {

    public static void main(String[] args) {
        SumFactorial calculator = new SumFactorial();
        int sumAllDigits = calculator.getSum(100);
        System.out.println(sumAllDigits);

    }
}
