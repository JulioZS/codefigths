/* Given a sequence of integers as an array, determine whether it is possible to obtain a strictly
increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an.
Sequence containing only one element is also considered to be strictly increasing. */

package Intro.EdgeOfTheOcean;

public class AlmostIncreasingSequence {

    boolean almostIncreasingSequence(int[] sequence) {

        // The array should be increasing
        // But I can also remove 1 element from the array
        int previous;
        int current;
        int next;
        boolean removed = false;

        for (int i = 1; i < sequence.length - 1; i++) {

            previous = sequence[i - 1];
            current = sequence[i];

            if (i + 1 < sequence.length) {

                next = sequence[i+1];

            } else {

                if (previous >= current) {
                    return false;
                }

                return true;
            }

            if (previous < current) {

                if (!(current < next)) {

                    int afterNext;

                    if (i + 2 < sequence.length) {

                        afterNext = sequence[i+2];

                    } else {

                        if (removed != false) {

                            return false;
                        }

                        return true;
                    }

                    if (current < afterNext || (next < afterNext && previous < next)) {

                        if (removed == false) {

                            i = i + 1;
                            removed = true;

                        } else {

                            return false;

                        }
                    } else {

                        return false;

                    }
                }

            } else if (!(previous < next)) {

                if (!(current < next)) {
                    return false;
                } else {

                    if (removed == false) {

                        removed = true;

                    } else {

                        return false;

                    }
                }

            } else {

                if (removed == false) {

                    removed = true;

                } else {

                    return false;

                }
            }
        }

        return true;
    }
}
