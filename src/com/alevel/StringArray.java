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
    }
    public void leftRight(){
        for (int z=0; z< array.length-1; z++) {
            //array[z].toString();
            for (int k = 1; k < array.length; k++) {
                String sort = array[k];
                System.out.println("sort " + sort);
                int j = k;
                while (j > 0 && (array[j - 1].compareTo(sort)>=0)) {
                    this.array[j] = this.array[j - 1];
                    j--;
                }
                this.array[j] = sort;
            }

        }
       /* String mus = Arrays.toString(array);
        System.out.println(mus + "; ");*/
        /*for (int left = 1; left< array.length-1; left++){
            String value = array[left];
            int l = left-1;
            for (; l >= 0; l--){
                if (array[left].compareTo(array[l])>=0){
                    array[l+1] = array[l];
                }else {
                    break;
                }
            }array[l+1] = value;
        }*/
    }
}
