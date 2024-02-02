package Day9DataStructure;

import java.util.Arrays;
//Implement a binary search algorithm to find the index of a given element in a sorted array.
// The program should print the index if the element is found or indicate if it's not present in the array.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 6, -3, 9, 0};
        foundIndex(arr,11);


    }
    public static void foundIndex(int arr[],int element)
    {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println(element + " found at index " + i);
                break;
            }
        }
        if (i == arr.length)
            System.out.println("l'element "+element+" it's not present in the array ");

    }
}