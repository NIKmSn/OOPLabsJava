package com.company;

import java.math.BigInteger;

public class Main {

    public static BigInteger Factorial(int n)
    {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; ++i)
        {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {
    for (int i = 1; i<=10; ++i)
    {
        System.out.println(String.format("Factorial of %d: %d", i, Factorial(i)));
    }
    }
}
