import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class Main {
	public static void main(String args[]) throws IOException{
		
		char[] alphabet = new char[26];
		int[] positions = new int[26];
		Arrays.fill(positions, -1);
		char currentChar = 'a';
        for (int i = 0; i < 26; i++) {
            alphabet[i] = currentChar;
            currentChar++;
        }

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = bf.readLine();
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
		    for (int j = 0; j < alphabet.length; j++) {
		        if (alphabet[j] == str.charAt(i) && positions[j] == -1) {
		            positions[j] = i;
		        }
		    }
		}
		
		for (int i = 0; i < positions.length; i++) {
		    bw.write(positions[i] + " ");
		}
	
		bw.flush();
        bw.close();
        bf.close();
       
	}
}