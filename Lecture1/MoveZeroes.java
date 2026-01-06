package Lecture1;
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {2,1,0,1,0,0,6,0};
        solution1(nums);
        // solution2(nums);
        for(int ele : nums) {
            System.out.print(ele+" ");
        }
    }
    
    // T.C.:- O(N)
    // S.C.:- O(N)
    public static void solution1(int[] nums) {
        int[] ans = new int[nums.length];
        int idx=0;
        for(int i=0; i < nums.length; i++)
        {
            if(nums[i]!=0)
            {
                ans[idx++]=nums[i];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }

    // T.C. :- O(N)
    // S.C. :- O(1)
    public static void solution2(int[] nums) {
        int idx=0;
        for(int i=0; i < nums.length; i++)
        {
            if(nums[i]!=0)
            {
                nums[idx++]=nums[i];
            }
        }
        
        while(idx<nums.length)
        {
            nums[idx++]=0;
        }
    }
}