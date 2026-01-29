package Lecture14;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        boolean ans = solution(arr);
    }

    // T.C.:- O(N)
    // S.C.:- O(N)
    public static boolean solution(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums) {
            if(map.containsKey(ele)) {
                return true;
            } else {
                map.put(ele, 1);
            }
        }


        return false;
    }
}
