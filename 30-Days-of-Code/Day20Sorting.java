import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static void bubblesort(int[] array){
         if (array == null) {
            return;
        }
        int swaps = 0;
        for(int i=0;i<array.length;i++){
            boolean temp = true;
            for(int j=1;j<array.length-i;j++){
                if(array[j-1]>array[j]){
                    swap(array, j-1, j);
                    swaps++;
                    temp = false;
                }
            }
            if(temp){
                break;
            }
        }
        System.out.println("Array is sorted in "+ swaps +" swaps.");
    }

    private static void swap(int[] array, int i, int j ){
        int temp =array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubblesort(a);
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: " + a[n-1]);

    }
}