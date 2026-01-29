package Lecture14;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = solution(s);
        System.out.println("The First Unique Character index "+ ans);
    }

    // T.C.:- O(N)
    // S.C.:- O(N)
    public static int solution(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ele : s.toCharArray()) {
            if(map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq+1);
            } else {
                map.put(ele, 1);
            }
        }

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }
}
