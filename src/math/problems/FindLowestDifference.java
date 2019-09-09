package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};


            int a1 = array1.length;
            int a2 = array2.length;

            System.out.println("lowest difference : "+difference(array1, array2, a1, a2));
        }


        static int difference(int [] array1, int [] array2, int a1, int a2)
        {
            Arrays.sort(array1);
            Arrays.sort(array2);

            int i = 0, j = 0;

            int result = Integer.MAX_VALUE;

            while (i < a1 && j < a2)
            {
                if (Math.abs(array1[i] - array2[j]) < result)
                    result = Math.abs(array1[i] - array2[j]);

                if (array1[i] < array2[j])
                    i++;

                else
                    j++;
            }
            return result;

        }

    }

