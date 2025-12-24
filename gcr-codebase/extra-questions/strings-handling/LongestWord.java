
//Write a Java program that takes a sentence as input and returns the longest word in the
//sentence.
import java.util.*;

public class LongestWord {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String s = sc.nextLine();

        System.out.println("Longest word: " + longestWordInSentence(s));

        sc.close();
    }

    public static String longestWordInSentence(String input) {

        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (ch != ' ') {
                currentWord = currentWord + ch;
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }

        //Check last word
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        return longestWord;
    }
}
