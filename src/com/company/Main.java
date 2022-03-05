package com.company;

public class Main {

    public static void main(String[] args) {
        double[] massive = {1.5, 2.3, 3.4, 4.4, 5.8, 54.6, -233.57, 43.7, 65.8, -121.6, 324.98, 5562.77, -765.76, 124.85, 6765.786};
        boolean negative = false;
        double summa = 0;
        int call = 0;
        for (double element:massive) {
            if (element < 0) {
                negative = true;
            }
            if (negative == true && element > 0) {
                summa += element;
                call++;
            }
        }
        System.out.println(summa/call);
    }
}
