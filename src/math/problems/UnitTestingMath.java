package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        try {
            Assert.assertEquals(Factorial.factorial(5), 120);
            System.out.println("Unit testing passed");
        }catch (AssertionError ar){
            System.out.println("Unit testing failed");
        }
        //Fibonacci Unit Testing

        //Missing Number Unit Testing

        //Lowest Number Unit Testing


        //Lowest Difference Unit Testing


    }
    }

