package Lecture14;

import java.util.HashMap;

public class FirstLetterAppearTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        char ans = solution(s);
        System.out.println("The First Letter Appear Twice "+ ans);
    }

    // T.C.:- O(N)
    // S.C.:- O(N)
    public static char solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                return ch;
            } else {
                map.put(ch, 1);
            }
        }

        return '.';
    }
}
