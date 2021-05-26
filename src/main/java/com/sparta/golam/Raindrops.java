package com.sparta.golam;

public class Raindrops {

    public String plingPlangPlong(int n) {
        int moduloThree = n % 3, moduloFive = n % 5, moduloSeven = n % 7;

        int[] remainders = {moduloThree, moduloFive, moduloSeven};
        String[] dropletNoises = {"Pling", "Plang", "Plong"};

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= remainders.length - 1; i++) {
            if (remainders[i] == 0) {
                stringBuilder.append(dropletNoises[i]);
            }
        }

        if (n == 0) {
            return "0";
        } else if (stringBuilder.toString().equals("")) {
            return Integer.toString(n);
        } else {
            return stringBuilder.toString();
        }
    }
}
