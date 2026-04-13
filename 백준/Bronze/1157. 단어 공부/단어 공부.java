import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] alphabet = new int[26];

        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i) - 'A']++;
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char) (i + 'A'); 
            } else if (alphabet[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}