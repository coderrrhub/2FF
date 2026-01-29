package Lecture15;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "abaac";
        String magazine = "cabaaaf";
        boolean ans = solution(ransomNote, magazine);
        System.out.println(ans);
    }

    // T.C.:- O(N)
    // S.C.:- O(N)
    public static boolean solution(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()) {
            if(map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch, freq+1);
            } else {
                map.put(ch, 1);
            }
        }

        for(char ch : ransomNote.toCharArray()) {
            if(map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch, freq-1);
                if(map.get(ch) == 0) { // freq == 1
                    map.remove(ch);
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
