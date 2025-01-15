package z4;

import z3.FindRepeats;

public class Test {
    public static void main(String[] args){
        Palindrome palindrome = new Palindrome();
        String t = "казак";

        System.out.println(t + " "+ palindrome.isPalindromeWord(t));
    }
}
