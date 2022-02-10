package com.dicoding.javafundamental.perulangan;

public class While {
    public static void main(String[] args) {
        int value = 1;
        int i = 1, j, k, l;
        int max_loop = 5;

        while (value <= 10) {
            System.out.print("Angka : " + value);
            value++;
            System.out.print("\n");
        }
        System.out.println();
        //piramid samping
        while(i <= max_loop)
        {
            j = 1;
            while(j <= i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        k = max_loop-1;
        while(k >= 1)
        {
            l = 1;
            while(l <= k)
            {
                System.out.print("*");
                l++;
            }
            System.out.println();
            k--;
        }
    }
}
