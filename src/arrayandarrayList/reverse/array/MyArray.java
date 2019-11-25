package arrayandarrayList.reverse.array;

import arrayandarrayList.reverse.array.inplace.ReverseInPlace;
import arrayandarrayList.reverse.array.normal.SimpleReverse;

public class MyArray {

    public static void main(String[] args) {
        SimpleReverse simpleReverse = new SimpleReverse();
        ReverseInPlace reverseInPlace = new ReverseInPlace();
        int numArray[] = new int[9];
        for (int i = 1; i < numArray.length; ++i) {
            numArray[i] = 2 * i;
        }

        printArray("MyArray", numArray);

        printArray("simple reversed array", simpleReverse.simpleReverse(numArray));

       printArray("Reverse InPlace array", reverseInPlace.inPlaceReverse(numArray));

    }

    private static void printArray(String name, int[] myArray){
        System.out.print(name +"is []");
        for (int x = 0; x < myArray.length; x++) {
            System.out.print(" " + myArray[x]);
        }
        System.out.println();
    }
}
