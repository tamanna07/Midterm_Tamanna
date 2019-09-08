package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String a, b="";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check if it is a Palindrome: ");
        String p = input.nextLine();
        int n = p.length();

        for(int i = n - 1; i >= 0; i--)
        {
            b =  b + p.charAt(i);
        }
        if(p.equalsIgnoreCase(b))
        {
            System.out.println(p+" is palindrome.");
        }
        else
        {
            System.out.println(p+ " is not palindrome.");
        }
    }
}
