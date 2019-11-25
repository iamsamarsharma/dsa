package arrayandarrayList.anagram;

import java.util.Arrays;

public class CheckAnagram {

    public boolean validateAnagram(char[] firstString, char[] secondString) {

        if (firstString.length != secondString.length)
            return  false;

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        for (int i=0; i< firstString.length; i++) {
            if(firstString[i] != secondString[i])
                return false;
        }

        return true;
    }
}
