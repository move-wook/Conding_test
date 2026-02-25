import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            String result = "YES";
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        result = "NO";
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                result = "NO";
            }
            System.out.println(result);
        }
    }
}