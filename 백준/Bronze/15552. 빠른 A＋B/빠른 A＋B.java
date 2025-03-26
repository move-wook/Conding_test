import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
        int cnt = Integer.parseInt(bf.readLine());
        
        for (int index = 0; index < cnt; index++){
            st = new StringTokenizer(bf.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bf.close();  // 입력 종료
		bw.flush();  // 출력 버퍼 비우기
        bw.close();  // 자원 정리       
	}
}