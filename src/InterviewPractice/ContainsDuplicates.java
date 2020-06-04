/* Given an array of integers, write a function that determines whether the array contains any duplicates.
Your function should return true if any element appears at least twice in the array,
and it should return false if every element is distinct. */

package InterviewPractice;

import java.util.HashSet;

public class ContainsDuplicates {

    boolean containsDuplicates(int[] a) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int element : a) {
            if (!hashSet.add(element)) {
                return true;
            }
        }

        return false;
    }
}
