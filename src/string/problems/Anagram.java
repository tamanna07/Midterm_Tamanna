package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {
    public static boolean isItAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
        {
            return false;
        }
        if(str1.toLowerCase().equals(str2.toLowerCase()))
        {
            return false;
        }

        char[] chr1 = str1.toLowerCase().toCharArray();
        char[] chr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);

        for (int i = 0; i < chr1.length; i++)
        {
            if(chr1[i] != chr2[i])
            {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        String str1 = "ACT";
        String str2 = "CAT";
        if (isItAnagram(str1, str2))
        {
            System.out.print(str1+" and "+str2+" is anagram");
        }
        else {
            System.out.print(str1+" and "+str2+" is not anagram");
        }







    }
}
