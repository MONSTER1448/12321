package com.company;

public class Main {

    public static void main(String[] args) {
    int[] arrays = {1,2,3,4,5,6,7,8,9,10}; {
     int a;
        for (a = 0, a < 5, a++) {
        int b = a + arrays[a];
        System.out.println("sum of first 5 elements is" + b);
        }
        int c = 1;
        for (int i = 5;i < 10;i++){
            if (arrays[i] > 0) {c = c * arrays[i];}
        }
        System.out.print("product last 5 numbers: " + c);
    }
}
