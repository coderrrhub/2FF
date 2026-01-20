package Lecture6;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,7,5,9,1,3};    
        for(int i = 1; i < arr.length; i++) {
            correctPlacePosition(arr, i);
        }
        for(int ele : arr) {
            System.out.print(ele+"  ");
        }

             String s = "abcabc";
        String t = "abc";
        String a = t +"abc";
        String b = "abc"+"abc";
        String w = "abcabc";
        System.out.println(a == b);
        System.out.println(w == b);
    }

    public static void correctPlacePosition(int[] arr, int pos) {
        int temp = arr[pos];
        int i = pos-1;
        while(i >= 0) {
            if(arr[i] >= temp) {
                arr[i+1] = arr[i];
            } else {
                break;
            }
            i--;
        }

        arr[i+1] = temp;
    }
}