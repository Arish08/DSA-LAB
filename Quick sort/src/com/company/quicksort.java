package com.company;

public class quicksort {
    public int[] sort(int[] array, int start,int end) {
        if (start >= end) {
            return array;
        }
        int boundary = partition(array, start, end);
        sort(array,start,boundary-1);
        sort(array,boundary+1,end);
return array;


    }
    private int partition(int[] array, int start,int end){

        int pivot = array[end];
        int boundary = start-1;
        for (int i = start; i <=end  ; i++) {
            if (array[i]<=pivot) {

                swap(array, i, ++boundary);
            }

        }
        return boundary;
    }
    public void swap(int []array ,int index1,int index2){

        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;

    }
    public void print (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+  " ");

        }

    }



}
