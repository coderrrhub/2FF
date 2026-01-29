package Lecture15;

import java.util.HashMap;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        int ans = solution(candyType);
        System.out.println(ans);
    }

    // T.C.:- O(N)
    // S.C.:- O(N)
    public static int solution(int[] candyType) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : candyType) {
            if(map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq+1);
            } else {
                map.put(ele, 1);
            }
        }

        int differentCandiesAvailable = map.size();
        int aliceCapacity = candyType.length / 2;

        // if(differentCandiesAvailable <= aliceCapacity) {
        //     return differentCandiesAvailable;
        // } else {
        //     // aliceCapacity > differentCandiesAvailable
        //     return aliceCapacity;
        // }

        // OR
        return Math.min(differentCandiesAvailable, aliceCapacity);
    }
}
