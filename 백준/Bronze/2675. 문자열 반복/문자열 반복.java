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
        //1. 몇개의 로우를 입력받을지
        //2. (각항목 반복) 문자열 입력
        int len = Integer.parseInt(bf.readLine());
        for(int i=0; i<len; i++){
        	StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int N0 = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for (char c : str.toCharArray()) {
                for (int j = 0; j < N0; j++) {
                    sb.append(c);
                }
            }
            bw.write(sb.toString());
            bw.newLine(); // 추가!!
        }
        bw.flush();

        // 스트림 닫기
        bw.close();
        bf.close();
	}
}