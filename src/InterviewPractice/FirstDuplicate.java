/*Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index.
In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other
number does. If there are no such elements, return -1. */

package InterviewPractice;

import java.util.HashSet;

public class FirstDuplicate {

    public int firstDuplicate(int[] a) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int element : a) {
            if (!hashSet.add(element)) {
                return element;
            }
        }

        return-1;
    }
}
