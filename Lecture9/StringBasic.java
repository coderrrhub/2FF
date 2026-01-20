package Lecture9;

public class StringBasic {
    public static void main(String[] args) {
        String s = "abc";
        String t = new String("abc");
        String a = "abc";
        String b = new String("abc");
        System.out.println(s == t); // false
        System.out.println(s == a); // true
        System.out.println(s == b); // false
        s = s + "abc";
        String c = "abc"+"abc";
        String d = "abcabc";
        System.out.println(s == c); // false
        System.out.println(s == d); // false
        System.out.println(c == d); // true

        String s1 = 10 + "d" + s + 40 + (10+20); 
        String s2 = 10 + 'a' + s + 40 + 30; 
        String s3 = 10 + s + 'a' + (40+10); 
        System.out.println(s1); // 10dabcabc4030
        System.out.println(s2); // 107abcabc4030
        System.out.println(s3); // 10abcabca50

        String s4 = "abcedeftg";
        System.out.println(s4.substring(2, 6)); // cede
        System.out.println(s4.substring(2 )); // cedeftg

        String s5 = "abcdef";
        String s6 = "abcaef";
        System.out.println(s5.compareTo(s6)); // 3
        System.out.println(s6.compareTo(s5)); // -3

        StringBuilder sb = new StringBuilder("abc");
        sb.append('d');
        System.out.println(sb.toString()); // abcd
    }
}
