import java.util.Arrays;
import java.util.Scanner;

public class Anagram {


    public static int isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
            return 1;
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
            return -1;
        }

    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Integer result = 0;

            System.out.println("Enter word to find anagram with");
            String a = in.nextLine();
            System.out.println("Enter words to search from");
            String s = in.nextLine();
            System.out.println("You entered duo: " + a + " | " + s);
            String[] words = s.split(" ");
            for (String word : words) result = isAnagram(a,word);;

        }

}
