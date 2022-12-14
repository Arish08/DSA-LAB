package com.company;

public class Main {

    public static void main(String[] args) {

    int []arr = {3,4,8,9,2,7};
    quicksort quick = new quicksort();
    arr = quick.sort(arr,0,arr.length-1);
    quick.print(arr);


    }
}
