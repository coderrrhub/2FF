package Lecture15;

import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        int ans = solution(jewels, stones);
        System.out.println(ans);
    }

    // T.C.:- O(N)
    // S.C.:- O(N)
    public static int solution(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            if(map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch, freq+1);
            } else {
                map.put(ch,1);
            }
        }

        int ans = 0;
        for(int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            if(map.containsKey(ch)) {
                ans += map.get(ch);
            }
        }
        return ans;
    }
}
