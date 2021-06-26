package com.alevel;

import java.util.Arrays;

public class StringArray {
    String[] array;
    public StringArray(String... value){
        for (String i : value)
            this.array = value;
    }
    public void value(){
        String mus = Arrays.toString(array);
        System.out.println(mus + "; ");
        for (int i = 1; i <= array.length; i++) {
            String rot = array[i-1];
            System.out.print(i + " number is " + rot + "; ");
        }System.out.println();
    }
    public void leftRight(){
            for (int i = 1; i < array.length; i++) {
                String sort = array[i];
               // System.out.println("sort " + sort);
                int j = i;
                while (j > 0 && (array[j - 1].compareTo(sort)>=0)) {
                    this.array[j] = this.array[j - 1];
                    j--;
                }
                this.array[j] = sort;
            }
    }

    public void righLeft(){
        for (int inv = 0; inv < array.length/2; inv++) {
            String tmp = array[inv];
            array[inv] = array[array.length - inv - 1];
            array[array.length - inv - 1] = tmp;
            for (int i = 1; i < array.length; i++) {
                String sort = array[i];
                int j = i;
                while (j > 0 && (array[j - 1].compareTo(sort)<=0)) {
                    this.array[j] = this.array[j - 1];
                    j--;
                }
                this.array[j] = sort;
            }
        }

    }
}
