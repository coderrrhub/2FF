package Lecture8;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,1,3,7,5,2,3};
        // solution1(arr);
        solution2(arr);
        for(int ele : arr) {
            System.out.print(ele+" ");
        }
    }

    // T.C.:- O(N^2) for best, average and worst case
    // S>C.:- O(1)
    public static void solution1(int[] arr) {
        int len = arr.length;
        for(int pass = 1; pass < len; pass++) {
            for(int i = 0; i < len - pass; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    // T.C.:- O(N^2) for average and worst case
    // T.C.:- O(N) for best case
    // S.C.:- O(1)
    public static void solution2(int[] arr) {
        int len = arr.length;
        for(int pass = 1; pass < len; pass++) {
            boolean swapped = false;
            for(int i = 0; i < len - pass; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if(!swapped) {
                break;
            }
        }
    }
}
