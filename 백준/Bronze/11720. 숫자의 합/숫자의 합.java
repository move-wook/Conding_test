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

        // 첫 줄에서 숫자 개수 N 읽기
        int len = Integer.parseInt(bf.readLine());

        // 두 번째 줄에서 숫자들을 문자열로 입력 받기
        String numberStr = bf.readLine();

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Character.getNumericValue(numberStr.charAt(i));
        }

        // 출력
        bw.write(String.valueOf(sum));
        bw.flush();

        // 스트림 닫기
        bw.close();
        bf.close();
	}
}
