public class string_methods {
    public static void main(String[] args) {
        // Strings are Immutable
        String s = "mahima";

        // find length
        System.out.println(s.length());

        // print all characters of a string- use of charAt(index)
        for(int i = 0; i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();

        // CompareTo function- It is used to compare string
        // if s1>s2 - return +ve value
        // if s1==s2 - return 0
        // if s1<s2 - return -ve value
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = "stark";
        String s4 = "Zonyy";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

        // Use of substring(beg index, end index)
        String sentence = "What is your name?"; // Now want only specific word
        System.out.println(sentence.substring(8,sentence.length()-1));
        System.out.println(sentence.substring(8));

        sentence += " this is it.";
        System.out.println(sentence);
    }
}
