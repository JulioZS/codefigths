/* Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
each statue having an non-negative integer size. Since he likes to make things perfect,
he wants to arrange them from smallest to largest so that each statue will be bigger than
the previous one exactly by 1. He may need some additional statues to be able to accomplish that.
Help him figure out the minimum number of additional statues needed. */

package Intro.EdgeOfTheOcean;

import java.util.Arrays;

public class ConsecutiveArray {

    int makeArrayConsecutive2(int[] statues) {

        int difference = 0;
        Arrays.sort(statues);

        for (int i = 0; i < statues.length-1; i ++) {

            if (statues[i] + 1 < statues[i+1] ) {

                difference += statues[i+1] - statues[i] -1;

            }
        }

        return difference;

    }


}
