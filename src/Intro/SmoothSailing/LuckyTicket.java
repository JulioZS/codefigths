/* Ticket numbers usually consist of an even number of digits.
A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
Given a ticket number n, determine if it's lucky or not. */


package Intro.SmoothSailing;

public class LuckyTicket {

    boolean isLucky(int n) {

        // A ticket number is lucky if sum of first half = sum of second half
        String stringN = String.valueOf(n);
        int firstHalf = 0;
        int secondHalf = 0;

        for (int i = 0; i < stringN.length(); i++) {

            if (i+1 <= stringN.length()/2) {
                firstHalf += Integer.valueOf(stringN.charAt(i));
            } else {
                secondHalf += Integer.valueOf(stringN.charAt(i));
            }
        }

        return firstHalf == secondHalf;
    }


}
