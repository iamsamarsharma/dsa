package arrayandarrayList.anagram;

public class AnagramMain {

    public static void main(String[] args) {

        CheckAnagram checkAnagram = new CheckAnagram();
        String s1 = "restful";
        String s2 = "fluster";


        if (checkAnagram.validateAnagram(s1.toUpperCase().toCharArray(), s2.toUpperCase().toCharArray()))
            System.out.println("It's AnaGram");
        else
            System.out.println("Not Anagram");

    }
}
