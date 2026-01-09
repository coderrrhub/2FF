package Lecture3;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1,3,3,2};
        int[] ans = solution1(nums);
        int[] res = solution2(nums);
    }

    // T.C.:- O(N^2)
    // S.C.:- O(N)
    public static int[] solution1(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length;i++) {
            int leftProduct = 1;
            for(int j = 0; j < i; j++) {
                leftProduct *= nums[j];
            }

            int rightProduct = 1;
            for(int j = i+1; j < nums.length; j++) {
                rightProduct *= nums[j];
            }

            ans[i] = leftProduct * rightProduct;
        }

        return ans;
    }

    // T.C.:- O(N)
    // S.C.:- O(N)
    public static int[] solution2(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int leftProduct = 1;
        int[] rightProduct = new int[len];
        rightProduct[len-1] = 1;
        for(int i = len-2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i+1] * nums[i+1];
        }
        for(int i = 0; i < nums.length;i++) {
            ans[i] = leftProduct * rightProduct[i];
            leftProduct *= nums[i];
        }

        return ans;
    }
}
