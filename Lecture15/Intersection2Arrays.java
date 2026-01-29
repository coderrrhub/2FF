package Lecture15;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection2Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2,1};

        int[] ans = solution(nums1, nums2);
        
        System.out.println("Intersection Unique Elements ");
        for(int ele : ans) {
            System.out.println(ele);
        }
    }

    // T.C.:- O(N)
    // S.C.:- O(N)
    public static int[] solution(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++) {
            int ele = nums1[i];
            if(map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq+1);
            } else {
                map.put(ele, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++) {
            int ele = nums2[i];
            if(map.containsKey(ele)) {
                // intersect
                list.add(ele);
                map.remove(ele);
            }
        }

        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
