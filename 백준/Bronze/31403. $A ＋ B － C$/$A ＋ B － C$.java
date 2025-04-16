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
		// 첫 줄에서 N과 M 읽기
		StringBuilder str = new StringBuilder();
		
		int []num = new int[3];
        for (int i = 0; i < 3; i++) {
            String line = bf.readLine();
            num[i] = Integer.parseInt(line);
        }
        int anwer = num[0] + num[1] - num[2];
        int anwer2 = Integer.valueOf(str.append(String.valueOf(num[0])).append(String.valueOf(num[1])).toString()) - num[2];
        
        bw.write(String.valueOf(anwer));
        bw.newLine();
        bw.write(String.valueOf(anwer2));
        
        bw.flush();
        bw.close();
        bf.close();
		
		
	}
}