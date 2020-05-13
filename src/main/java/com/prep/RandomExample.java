package com.prep;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random rm = new Random();

        for(int index = 0; index < 5; index++) {

            String otp = new DecimalFormat("00000").format(rm.nextInt(99999));
            System.out.println(otp);
        }
    }
}
