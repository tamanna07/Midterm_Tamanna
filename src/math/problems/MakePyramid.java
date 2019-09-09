package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        int p = 20;
        pyramid(p);

    }
    public static void pyramid(int p)
    {
        int k = 2*p - 2;

        for (int i=0; i<p; i++)
        {
            for (int j=0; j<k; j++)
            {
                System.out.print(" ");
            }
            k = k - 1;

            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }

            System.out.println();
        }






    }
  }
