/* Some people are standing in a row in a park. There are trees between them which cannot be moved.
Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
People can be very tall! */


package Intro.SmoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeopleSorter {

    List<Integer> sortByHeight(int[] a) {

        // Rearrange people by their heights in a non-descending order
        // No moving the trees
        List<Integer> list = new ArrayList<>();
        List<Integer> treeList = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {

            if (a[i] == -1) {
                treeList.add(i);
            }
        }

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                list.add(a[i]);
            }
        }

        for (Integer index : treeList) {
            list.add(index, -1);
        }

        return list;
    }



}
