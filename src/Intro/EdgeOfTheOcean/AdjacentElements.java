/* Given an array of integers, find the pair of adjacent elements that has the largest product
and return that product.*/

package Intro.EdgeOfTheOcean;

public class AdjacentElements {

    int adjacentElementsProduct(int[] inputArray) {

        int product = inputArray[0]*inputArray[1];
        int bla = inputArray.length;

        for(int i = 1; i < bla-1; i++) {
            if  (inputArray[i] * inputArray[i+1] > product) {

                product = inputArray[i] * inputArray[i+1];
            }
        }

        return product;
    }


}
