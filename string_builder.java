import java.util.*;
class string_builder{
    static String reverseString(String s){
        String n = "";
        for(int i = s.length()-1;i>-1;i--){
            n+=s.charAt(i);
        }
        return n;
    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello world");
        System.out.println(s);
        // CharAt function
        System.out.println(s.charAt(1));
        // SetCharAt function
        s.setCharAt(1, 'o');
        System.out.println(s);
        // Insert function
        s.insert(5, 'w');
        System.out.println(s);
        // Delete function
        s.delete(6,8);
        System.out.println(s);
        // Append function
        s.append('1');
        System.out.println(s);
        // length function
        System.out.println(s.length());

        System.out.println(reverseString("hello world"));
    }
}