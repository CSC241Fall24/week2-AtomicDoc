// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string

        if(s.length()-1 <= 1){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);

    }
}