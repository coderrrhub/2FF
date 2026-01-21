package Lecture11;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "    a good   example   ";
        String ans1 = solution1(s);
        String ans2 = solution2(s);
    }


    // T.C.:- O(N)
    // S.C.:- O(N)
    public static String solution1(String s) {
        String t = s.trim();
        String[] arr = t.split(" ");
        // String res = "";
        StringBuilder res = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--) {
            String word = arr[i];
            if(word.length() != 0) {
                // add
                res.append(word);
                if(i != 0) {
                    res.append(" ");
                }
            }
        }

        return res.toString();
    }

    // T.C.:- O(N)
    // S.C.:- O(N)
    public static String solution2(String s) {
        String t = s.trim();
        int i = t.length()-1;
        // String res = "";
        StringBuilder res = new StringBuilder();
        // String word = "";
        StringBuilder word = new StringBuilder();
        while(i >= 0) {
            char ch = t.charAt(i);
            if(ch == ' ') {
                // res = res + word;
                // res = res + " ";
                word.reverse();               // ADD
                res.append(word);
                res.append(" ");
                // word = "";
                word.setLength(0);            // RESET
                
                // move till we don't get the space
                while(t.charAt(i) == ' ') {
                    i--;
                }


            } else {
                word.append(ch);
                i--;
            }
        }

        // word 
        // res = res + word;
        word.reverse();
        res.append(word);
        return res.toString();
    }
}
