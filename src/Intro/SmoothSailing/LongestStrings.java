/* Given an array of strings, return another array containing all of its longest strings.

Example:

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"]. */

package Intro.SmoothSailing;

import java.util.ArrayList;

public class LongestStrings {

    ArrayList<String> allLongestStrings(String[] inputArray) {

    // Given an array of strings, return another array containing all of its longest strings.

        int longestInput = 0;
        ArrayList allLongStrings = new ArrayList<String>();

        for (int i = 0; i < inputArray.length; i++) {

            if (longestInput <= inputArray[i].length()) {

                if (longestInput < inputArray[i].length()) {

                    allLongStrings.clear();

                }

                allLongStrings.add(inputArray[i]);
                longestInput= inputArray[i].length();
            }
        }

        return allLongStrings;

    }

}
