package Lecture12;

// T.C.:- O(N^2)
// S.C.:- O(1)
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,4,10,8,3,1};

        for(int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // swap ith and min_idx element
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        // print the elements
        for(int ele : arr) {
            System.out.print(ele+"  ");
        }
    }
}
