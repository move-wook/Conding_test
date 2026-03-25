import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();    // 전체 문서
        String word = sc.nextLine();   // 찾을 단어
        
        int count = 0;
        int index = 0;
        
        // 단어를 찾을 때까지 반복
        while ((index = doc.indexOf(word, index)) != -1) {
            count++;
            index += word.length(); // 찾은 단어의 길이만큼 건너뜀 (중복 방지)
        }
        
        System.out.println(count);
    }
}