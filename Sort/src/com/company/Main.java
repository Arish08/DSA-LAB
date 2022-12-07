package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myarray = SelectionSort(new int[]{1, 84, 21, 64, 87});
        for (int i = 0; i < myarray.length; i++) {

            System.out.print(" " +myarray[i]);

        }
        System.out.println("");
        int [] myarray1 = recursiveSelectionSort(new int[]{1,5,2,9,4,},0, 1);


        int []myarray2= insertionsort(new int[]{1,8,9,7,4,2});
        for (int i = 0; i < myarray2.length ; i++) {
            System.out.print(" "+myarray2[i]);
        }
        System.out.println(" ");
        int[]array3=insertionsortrecursive(new int[]{1,5,99,8,4},5);
        for (int i = 0; i < array3.length ; i++) {

            System.out.print(" " + array3[i]);
        }
        System.out.println("");
        int []myarray5 = bubblesort(new int[]{1,5,8,6,4,2});
        System.out.println(Arrays.toString(myarray5));


    }




    ///// iteratively sorting

    public static int[] SelectionSort(int a[]) {
        int min;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min])
                    min = j;

            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;


        }

        return a;
    }

    ////// Recursively Sorting
public static int[] recursiveSelectionSort(int[] a, int i, int j){
        if(i==a.length)
            System.out.println(Arrays.toString(a));
        else if(j==a.length){

            recursiveSelectionSort(a,i+1,i+2);

        }
        else {
            if(a[i]>a[j]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

            recursiveSelectionSort(a,i,j+1);

        }


    return a;
}
///// iterative insertion sort

    public static int[] insertionsort(int[]a){
        for (int i = 1; i <a.length ; i++) {
            int element = a[i];
            int j = i-1;
            while (j>0 && a[j]>element){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=element;
        }

        return a;
    }
    ////////////// insertion sort recursive

    public static int[] insertionsortrecursive(int[] arr, int n ) {

        if (n <= 1)
            return arr;

        insertionsortrecursive(arr, n - 1);
            int last = arr[n - 1];
            int j = n - 2;

            while (j >= 0 && arr[j] > last) {

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = last;

        return arr;
    }

    // Bubble sort iterative 
    public static int[] bubblesort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return array;
            }
        }
        return array;
    }

    }
