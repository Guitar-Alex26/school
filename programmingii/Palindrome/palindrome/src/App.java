import java.io.*;
import java.util.*;

class Palindrome {
    public static boolean isPalindrome(String inputStr) {
        String reverseString = "";
        boolean answer = false;
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reverseString = reverseString + inputStr.charAt(i);
        }
        if (inputStr.equals(reverseString)) {
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        // Prompt the user for a string.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String myString = in.nextLine();
        // Convert the input string to lowercase using toLowerCase() method.
        myString = myString.toLowerCase();
        // Invoke isPalindrome
        boolean result = Palindrome.isPalindrome(myString);
        // display if the string is or is not a palindrome.
        if (result) {
            System.out.println(myString + " is a palindrome!");
        } else {
            System.out.println(myString + " is not a palindrome!");
        }
        in.close();
    }
}