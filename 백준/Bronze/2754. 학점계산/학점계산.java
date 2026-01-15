import java.io.*;
import java.util.HashMap;


//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 학점 매핑
        HashMap<String, Double> map = new HashMap<String, Double>() {{
            put("A+", 4.3); put("A0", 4.0); put("A-", 3.7);
            put("B+", 3.3); put("B0", 3.0); put("B-", 2.7);
            put("C+", 2.3); put("C0", 2.0); put("C-", 1.7);
            put("D+", 1.3); put("D0", 1.0); put("D-", 0.7);
            put("F", 0.0);
        }};

        String grade = br.readLine();
        bw.write(map.get(grade) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}