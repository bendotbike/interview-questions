/*
*   IsPalindrome.java
*   Checks wether a given string is a palindrome (the same string after being reversed)
*/

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word;

        System.out.println("Enter a word: ");
        word = sc.nextLine();

        boolean palindrome = isPalindrome(word);

        if (palindrome) System.out.println(word + " is a palindrome.");
        else System.out.println(word + " is not a palindrome.");

    }

    public static boolean isPalindrome(String word) {
        int leftCounter = 0;
        int rightCounter = word.length() - 1;

        while (leftCounter <= rightCounter) {
            if (word.charAt(leftCounter) != word.charAt(rightCounter)) {
                return false; // Not palindrome
            } else {
                // So far, so good, so increment/de-increment counters
                leftCounter++;
                rightCounter--;
            }
        }
        // We've made it out of the loop, so the word is a palindrome - return true
        return true;
    }

}