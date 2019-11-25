package arrayandarrayList.reverse.array.normal;

public class SimpleReverse {

    public int[] simpleReverse (int[] myArray) {

        int[] reversedArray = new int[myArray.length];
        int x = 0;
        for (int i= myArray.length-1; i>=0; i--){

            reversedArray[x] = myArray[i];
            x++;
        }
        return reversedArray;
    }

}
