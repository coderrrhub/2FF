package Lecture7;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {5,7,8,8,8,8,8,8,14,16,18};
        int target = 8;
        int[] ans1 = solution1(arr, target);
        int[] ans2 = solution2(ans1, target);
    }

    // Linear Search
    // T.C.:- O(N)
    // S.C.:- O(1)
    public static int[] solution1(int[] nums, int target) {
        int first = -1, last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }


    // Binary Search
    // T.C.:- O(logN)
    // S.C.:- O(1)
    public static int[] solution2(int[] nums, int target) {
        int a = findFirstPosition(nums, target);
        int b = findLastPosition(nums, target);
        return new int[]{a, b};
    }

    public static int findLastPosition(int[] arr, int target) {
        int left = 0, right = arr.length-1;
        int ans = -1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(arr[mid] == target) {
                ans = mid;
                left = mid+1;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else if(arr[mid] > target) {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static int findFirstPosition(int[] arr, int target) {
        int left = 0, right = arr.length-1;
        int ans = -1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(arr[mid] == target) {
                ans = mid;
                right = mid-1;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else if(arr[mid] > target) {
                right = mid - 1;
            }
        }

        return ans;
    }
}
