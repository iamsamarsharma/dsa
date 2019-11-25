package arrayandarrayList.reverse.array.inplace;

public class ReverseInPlace {

    public int[] inPlaceReverse (int[] myArray){

        int startIndex = 0;
        int lastIndex = myArray.length-1;

        while (startIndex <= lastIndex){
            swap(myArray, startIndex, lastIndex);
            startIndex++;
            lastIndex--;
        }
        return myArray;
    }

    private void swap(int[] myArray, int startIndex, int lastIndex) {
        int temp = myArray[startIndex];
        myArray[startIndex] = myArray[lastIndex];
        myArray[lastIndex] = temp;
    }
}
