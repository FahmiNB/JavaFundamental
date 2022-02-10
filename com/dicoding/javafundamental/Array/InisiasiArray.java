package com.dicoding.javafundamental.Array;

public class InisiasiArray {
    public static void main(String[] args){
        //cara 1
        int[] arrInt = new int[]{1,2,3,4,5,6};

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

        System.out.println();
        //cara 2
        int[] arrInt1 = new int[6];
        arrInt1[0] = 1;
        arrInt1[1] = 2;
        arrInt1[2] = 3;
        arrInt1[3] = 4;
        arrInt1[4] = 5;
        arrInt1[5] = 6;

        System.out.println(arrInt1[0]);
        System.out.println(arrInt1[1]);
        System.out.println(arrInt1[2]);
        System.out.println(arrInt1[3]);
        System.out.println(arrInt1[4]);
        System.out.println(arrInt1[5]);

        System.out.println();
        //cara 3
        int[] arrInt2 = {1, 2, 3, 4, 5, 6};

        System.out.println(arrInt2[0]);
        System.out.println(arrInt2[1]);
        System.out.println(arrInt2[2]);
        System.out.println(arrInt2[3]);
        System.out.println(arrInt2[4]);
        System.out.println(arrInt2[5]);

        System.out.println();
        //looping array
        int[] arrInt3 = new int[1000000];

        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 1000000
        for (int x = 0; x < arrInt3.length; x++) {
            arrInt3[x] = x + 1;
            System.out.print(arrInt3[x] + " ");
        }
    }
}
