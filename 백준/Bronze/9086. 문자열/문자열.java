import java.io.*;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());  // 줄 개수

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            if (line.isEmpty()) continue;  // 빈 줄 스킵

            char first = line.charAt(0);      // 첫 문자
            char last = line.charAt(line.length() - 1);  // 끝 문자

            // 아스키 코드로 변환
            int firstAscii = (int) first;
            int lastAscii = (int) last;

            // 65~90 범위 체크 (대문자 A~Z)
            if (firstAscii >= 65 && firstAscii <= 90 &&
                    lastAscii >= 65 && lastAscii <= 90) {

                bw.write(first + "" + last + "\n");
                // 또는
                // bw.write(String.valueOf(first) + last + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}