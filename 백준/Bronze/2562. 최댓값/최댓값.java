
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
		int []num = new int[9];
        for (int i = 0; i < num.length; i++) {
            String line = bf.readLine();
            num[i] = Integer.parseInt(line);
        }
        int MAX = 0;
        int index=0;
        for(int i=0; i< num.length; i++){
        	if(num[i] > MAX){
        		MAX = num[i];
        		index = i+1;
        	}
        }
        bw.write(String.valueOf(MAX));
        bw.newLine();
        bw.write(String.valueOf(index));
        
        bw.flush();
        bw.close();
        bf.close();
		
		
	}
}
