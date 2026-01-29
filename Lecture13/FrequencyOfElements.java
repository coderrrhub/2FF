package Lecture13;

import java.util.HashMap;

// T.C.:- O(N)
// S.C.:- O(N)
public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,1,4,2,1,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr) {
            if(map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else {
                map.put(ele, 1);
            }
        }

        System.out.println(map);
    }
}
