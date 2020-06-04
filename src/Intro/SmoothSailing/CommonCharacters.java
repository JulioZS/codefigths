/* Given two strings, find the number of common characters between them.

Example
For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c". */

package Intro.SmoothSailing;

public class CommonCharacters {

    int commonCharacterCount(String s1, String s2) {

        int commonCharacterCount = 0;

        for (int i = 0; i < s2.length(); i++) {

            for (int j = 0; j < s1.length(); j++) {

                Character s1Character = s1.charAt(j);
                Character s2Character = s2.charAt(i);

                if (s1Character.equals(s2Character)) {
                    s1 = s1.replaceFirst(s1Character.toString(), "");
                    commonCharacterCount ++;
                    break;
                }
            }
        }

        return commonCharacterCount;
    }


}
