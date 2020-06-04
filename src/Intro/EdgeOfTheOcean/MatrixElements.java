/* After becoming famous, the CodeBots decided to move into a new building together.
Each of the rooms has a different cost, and some of them are free, but there's a rumour that all the
free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms,
or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room,
your task is to return the total sum of all rooms that are suitable for the CodeBots
(ie: add up all the values that don't appear below a 0). */

package Intro.EdgeOfTheOcean;

import java.util.ArrayList;

public class MatrixElements {

    int matrixElementsSum(int[][] matrix) {

        ArrayList hauntedColumns = new ArrayList<>();
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {

                if (matrix[row][column] == 0) {

                    hauntedColumns.add(column);

                } else if (!hauntedColumns.contains(column)) {
                    sum += matrix[row][column];
                }
            }
        }

        return sum;

    }
}
