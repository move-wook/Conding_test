import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] files = new String[n];
        
        for (int i = 0; i < n; i++) {
            files[i] = sc.next();
        }
        
        StringBuilder result = new StringBuilder();
        int len = files[0].length();
        
        for (int i = 0; i < len; i++) {
            char target = files[0].charAt(i);
            boolean isSame = true;
            
            for (int j = 1; j < n; j++) {
                if (target != files[j].charAt(i)) {
                    isSame = false;
                    break;
                }
            }
            
            if (isSame) {
                result.append(target);
            } else {
                result.append('?');
            }
        }
        
        System.out.println(result.toString());
    }
}