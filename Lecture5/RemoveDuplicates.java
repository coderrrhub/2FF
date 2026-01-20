package Lecture5;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,3,4};

        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    // T.C.:- O(N)
    // S.C.:- O(1)
    public static int removeDuplicates(int[] nums) {
        int idx = 1;
        for(int  i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }
}
