import java.util.*;

class LexicalTwist {

    public static String checkreverse(String word) {
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        return sb.reverse().toString();
    }

    public static void check(String word1, String word2) {

        if (word1.contains(" ") || word2.contains(" ")) {
            if (word1.contains(" ")) {
                System.out.println(word1 + " is an invalid word");
            }
            if (word2.contains(" ")) {
                System.out.println(word2 + " is an invalid word");
            }
            return;
        }

        String word = checkreverse(word2);

        if (word1.equalsIgnoreCase(word)) {

            String newWord = checkreverse(word1);
            newWord = newWord.toLowerCase();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < newWord.length(); i++) {
                char c = newWord.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    sb.append('@');
                } else {
                    sb.append(c);
                }
            }

            System.out.println(sb.toString());
        } 
        else {

            StringBuilder sb = new StringBuilder();
            sb.append(word1).append(word2);

            String upper = sb.toString().toUpperCase();

            int vowelcount = 0;
            int consonantcount = 0;

            for (int i = 0; i < upper.length(); i++) {
                char c = upper.charAt(i);
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowelcount++;
                } else {
                    consonantcount++;
                }
            }

            if (vowelcount > consonantcount) {

                Set<Character> set = new LinkedHashSet<>();
                for (int i = 0; i < upper.length(); i++) {
                    char c = upper.charAt(i);
                    if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                        set.add(c);
                    }
                }

                int count = 0;
                for (char c : set) {
                    System.out.print(c);
                    count++;
                    if (count == 2) break;
                }
                System.out.println();

            } 
            else if (consonantcount > vowelcount) {

                Set<Character> set = new LinkedHashSet<>();
                for (int i = 0; i < upper.length(); i++) {
                    char c = upper.charAt(i);
                    if (!(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                        set.add(c);
                    }
                }

                int count = 0;
                for (char c : set) {
                    System.out.print(c);
                    count++;
                    if (count == 2) break;
                }
                System.out.println();

            } 
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
  System.out.println("Enter first word");
        String word1 = sc.nextLine();
		 System.out.println("Enter second word");
        String word2 = sc.nextLine();

        check(word1, word2);
    }
}
