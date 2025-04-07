import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] submitted = new boolean[31]; // 1~30 출석번호 체크용

        for (int i = 0; i < 28; i++) {
            int studentNum = Integer.parseInt(bf.readLine());
            submitted[studentNum] = true;
        }

        // 제출 안 한 학생 번호 출력
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}