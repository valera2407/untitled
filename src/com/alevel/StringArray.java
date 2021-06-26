package com.alevel;

import java.util.Arrays;

public class StringArray {
    String[] array;
    public StringArray(String... bum){
        for (String i : bum)
            this.array = bum;
    }
    public void value(){
        String mus = Arrays.toString(array);
        System.out.println(mus + "; ");
        for (int f = 1; f <= array.length; f++) {
            String rot = array[f-1];
            System.out.print(f + " number is " + rot + "; ");
        }System.out.println();
    }
    public void leftRight(){
            for (int k = 1; k < array.length; k++) {
                String sort = array[k];
               // System.out.println("sort " + sort);
                int j = k;
                while (j > 0 && (array[j - 1].compareTo(sort)>=0)) {
                    this.array[j] = this.array[j - 1];
                    j--;
                }
                this.array[j] = sort;
            }
    }

    public void righLeft(){
        for (int y = 0; y < array.length/2; y++) {
            String tmp = array[y];
            array[y] = array[array.length - y - 1];
            array[array.length - y - 1] = tmp;
            for (int k = 1; k < array.length; k++) {
                String sort = array[k];
              //  System.out.println("sort " + sort);
                int j = k;
                while (j > 0 && (array[j - 1].compareTo(sort)<=0)) {
                    this.array[j] = this.array[j - 1];
                    j--;
                }
                this.array[j] = sort;
            }
        }

    }
}
