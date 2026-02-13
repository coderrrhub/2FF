package Lecture15;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean ans = solution(s, t);
        System.out.println(ans);
    }

    // T.C.:- O(N)
    // S.C.:- O(N^2)
    public static boolean solution(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch,freq+1);
            } else {
                map.put(ch,1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch,freq-1);

                if(map.get(ch) == 0) {
                    map.remove(ch);
                }
            } else {
                map.put(ch,1);
            }
        }

        return map.size() == 0;
    }
}
