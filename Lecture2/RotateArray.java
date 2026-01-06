package Lecture2;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        solution1(arr, 6);
        // solution2(arr, 4);
        // solution3(arr, 100);
    }

    // T.C.:- O(N) 
    // S.C.:- O(N)
    public static void solution1(int[] nums, int k) {
        int len = nums.length;
        int[] ans = new int[len];
        k = k % len;
        int idx = 0;

        for(int i = len-k; i < len; i++) {
            ans[idx] = nums[i];
            idx++;
        }

        for(int i = 0; i < len-k; i++) {
            ans[idx] = nums[i];
            idx++;
        }

        for(int i = 0; i < len; i++) {
            nums[i] = ans[i];
        }
    }

    // T.C.:- O(k*N)
    // S.C.:- O(1)
    public static void solution2(int[] nums, int k) {
         // k = 1000 ---> [0,1...len-1]
        int len = nums.length;
        k = k % len;
        // k times rotate k = 3
        for(int rot = 1; rot <= k ; rot++) {
            // [1,2,3,4,5]
            int temp = nums[len-1];
            // shifting starts from 2nd last element till 1st element
            for(int shifting = len - 2; shifting >=0; shifting--) {
                // [1,2,3,4,____]
                // current element = 4 --> put 4 in next position
                // [1,2,3,4,4]
                int currentElement = nums[shifting]; // current index is shifting
                // next index --- shifting + 1
                nums[shifting + 1] = currentElement;
            }

            // [1,1,2,3,4]
            // last element value lost
            nums[0] = temp;
            // [5,1,2,3,4]
        }
    }

    // T.C.:- O(N)
    // S.C.:- O(1)
    public static void solution3(int[] arr, int k) {
     int len = arr.length;
        k = k % len; // 1st step
        reverse(0, len-1, arr); // 2nd step reverse the whole array
        reverse(0, k-1, arr); // 3rd step first k elements reverse
        reverse(k, len-1, arr); // 4th step
    }

    public static void reverse(int start, int end, int[] arr) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
