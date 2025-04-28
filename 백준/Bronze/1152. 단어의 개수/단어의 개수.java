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
       
        String line = bf.readLine().trim(); // 앞뒤 공백 제거

        if (line.isEmpty()) {
            bw.write("0");
        } else {
            String[] array = line.split("\\s+");
            bw.write(Integer.toString(array.length));
        }

        bw.flush();
        bw.close();
        bf.close();
	
	}
 }