package com.company;



public class Main {
    static int i = 0;
    static int[] array = {1,2,3,4,5,6,7};
    public static void main(String[] args) {

        int result = ternarySearch(array, array.length -1, 0, 7);

        if (result != -1){
            System.out.println("Value found at index: " + result);
        }
        else {
            System.out.println("Value not found !");
        }

//        result = LinearSearchRecursive(array,27);
//
//        if (result != -1){
//            System.out.println("Value found at index: " + result);
//        }
//        else {
//            System.out.println("Value not found !");
//        }


    }

    //Linear Search O(n)
    public static int LinearSearchIterative(int[] a, int x){
        for (int i = 0; i < a.length; i++){
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }


    //Recursive Search O(n!)
    public static int LinearSearchRecursive(int[] a, int x){
        if (i > a.length-1){
            return -1;
        }
        if (a[i] == x) {
            return i;
        }
        i++;
        return LinearSearchRecursive(a, x);
    }

    public static int BinarySearchIterative(int[] a, int x){
        int p = 0;
        int r = a.length-1;

        for (int i = 0; p <= r; i++){
            int q = (p + r)/2;

            if (a[q] == x){
                return q;
            }
            if (x > q){
                p = q+1;
            }
            else if (x < q){
                r = q-1;

            }
        }
        return -1;
    }

    static int p = 0;
    static int r = array.length-1;

    public static int BinarySearchRecursion(int[] a, int x){

        if (i > a.length - 1){
            return -1;
        }

        int q = (p + r)/2;

        if (a[q] == x){
            return q;
        }
        if (x > q){
            p = q+1;
        }
        else {
            r = q-1;
        }

        i++;
        return BinarySearchRecursion(a, x);
    }

    public static int ternarySearch(int [] array, int right, int left, int target){
        if (left > right){
            return -1;
        }

        int partitionSize = (right - left)/3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (array[mid1] == target) {
            return mid1;
        }
        if (array[mid2] == target) {
            return mid2;
        }
        if (target < array[mid1]){
            return ternarySearch(array, mid1 - 1, left, target);
        }
        if (target > array[mid2]){
            return ternarySearch(array, right, mid2 + 1, target);
        }

        return ternarySearch(array, mid2 - 1, mid1 + 1, target);
    }

}