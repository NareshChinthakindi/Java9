package com.dbs;

import java.math.BigInteger;

public class BigIntegerTestBit {

    public static void main(String[] args) {
        int counter = 2;
        int n = 11;
//Lessthan value becomes true and -ve value would throw Arithmetic exceptions
        System.out.println(BigInteger.valueOf(counter).testBit(n));

    }
}
