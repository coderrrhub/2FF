package Lecture6;

public class LinearSearch {
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int target = 10;

        int result = search(arr, arr.length, target);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
    }

    // T.C.:- O(N)
    // S.C.:- O(1)
    public static int search(int arr[], int N, int target)
    {
        // Iterate over the array in order to
        // find the target
        for (int i = 0; i < N; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
