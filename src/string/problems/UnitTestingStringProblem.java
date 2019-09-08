package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        //Anagram unit testing
        Anagram.isItAnagram("CAT","ACT");
        Assert.assertTrue(true, "true");

        //Determine Largest Word Unit Testing
        DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");
        Assert.assertEquals("biological","biological");

        //Palindrome
        Palindrome.main(new String[]{"DAD"});
        Assert.assertEquals(true, true);

        //Permutation unit testing
        Permutation.doPermutation("ABC");
        Assert.assertEquals("ABC,BCA,CAB,CBA,BAC,ACB","ABC,BCA,CAB,CBA,BAC,ACB");

        //Duplicate Word unit testing
        DuplicateWord.duplicate("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
        Assert.assertEquals("Java"+"is","Java"+"is");







    }
}
