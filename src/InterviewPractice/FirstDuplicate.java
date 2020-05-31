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
