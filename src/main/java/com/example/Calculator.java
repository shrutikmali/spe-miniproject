package com.example;

public class Calculator {
    
    public String addition(double a, double b) {
        double ans = a + b;
        return Double.toString(ans);
    }

    public String subtraction(double a, double b) {
        double ans = a - b;
        return Double.toString(ans);
    }

    public String multiplication(double a, double b) {
        double ans = a * b;
        return Double.toString(ans);
    }

    public String division(double a, double b) {
        if(b == 0.0) {
            return "Cannot divide by 0";
        }
        else {
            double ans = a / b;
            return Double.toString(ans);
        }
    }

    String squareRoot(double a) {
        if(a < 0.0) {
            return "Cannot have square root of negative number";
        }
        else {
            double ans = Math.sqrt(a);
            return Double.toString(ans);
        }
    }

    String factorial(long a) {
        if(a < 0) {
            return "Cannot have factorial of negative number";
        }
        else {
            long ans = 1;
            for(long i = 2; i <= a; i++) {
                ans *= i;
            }
            return Long.toString(ans);
        }
    }

    String naturalLog(double a) {
        if(a <= 0.0) {
            return "Cannot have natural log of 0 or negative";
        }
        else {
            double ans = Math.log(a);
            return Double.toString(ans);
        }
    }

    String exponentiation(double a, double b) {
        double ans = Math.pow(a, b);
        return Double.toString(ans);
    }

}
