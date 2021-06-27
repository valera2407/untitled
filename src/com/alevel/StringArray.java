package com.alevel;

import java.util.Arrays;

public class StringArray {
    String[] array;
    public StringArray(String... value){
        this.array = value;
    }
    public void value(){
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString + "; ");
        for (int i = 1; i <= array.length; i++) {
            String outValue = array[i-1];
            System.out.print(i + " number is " + outValue + "; ");
        }System.out.println();
    }
    public void leftRight(){
            for (int i = 1; i < array.length; i++) {
                String sort = array[i];
                int j = i;
                while (j > 0 && (array[j - 1].compareTo(sort)>=0)) {
                    this.array[j] = this.array[j - 1];
                    j--;
                }
                this.array[j] = sort;
            }
    }

    public void righLeft(){
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
