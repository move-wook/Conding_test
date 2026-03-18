import java.util.*;

public class Main {
    static class Guess {
        String num;
        int s, b;
        Guess(String num, int s, int b) {
            this.num = num;
            this.s = s;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Guess> guesses = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            guesses.add(new Guess(sc.next(), sc.nextInt(), sc.nextInt()));
        }

        int answerCount = 0;

        for (int i = 123; i <= 987; i++) {
            String target = String.valueOf(i);
            
            if (target.contains("0")) continue;
          
            if (target.charAt(0) == target.charAt(1) || 
                target.charAt(1) == target.charAt(2) || 
                target.charAt(0) == target.charAt(2)) continue;

            boolean isPossible = true;

          
            for (Guess g : guesses) {
                int strike = 0;
                int ball = 0;

                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (j == k && target.charAt(j) == g.num.charAt(k)) strike++;
                        else if (j != k && target.charAt(j) == g.num.charAt(k)) ball++;
                    }
                }

                if (strike != g.s || ball != g.b) {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) answerCount++;
        }

        System.out.println(answerCount);
    }
}