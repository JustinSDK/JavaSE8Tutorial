package cc.openhome;

import java.util.Arrays;

public class Sort {
    public static <T extends Comparable<T>> T[] sorted(T[] array) {
        T[] arr = Arrays.copyOf(array, array.length);
        sort(arr, 0, arr.length - 1);
        return arr;
    }
    
    private static void sort(Object[] array, int left, int right) {
        if(left < right) { 
            int q = partition(array, left, right); 
            sort(array, left, q-1); 
            sort(array, q+1, right); 
        } 
    }

    private static int partition(Object[] array, int left, int right) {  
        int i = left - 1; 
        for(int j = left; j < right; j++) { 
            if(((Comparable) array[j]).compareTo(array[right]) <= 0) {
                i++; 
                swap(array, i, j); 
            } 
        } 
        swap(array, i+1, right); 
        return i + 1; 
    } 

    private static void swap(Object[] array, int i, int j) {
        Object t = array[i]; 
        array[i] = array[j]; 
        array[j] = t;
    }
} 
