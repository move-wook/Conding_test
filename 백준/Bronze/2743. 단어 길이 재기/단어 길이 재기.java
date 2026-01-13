import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokens = new StringTokenizer(br.readLine());
        String tt = tokens.nextToken();
        bw.write(String.valueOf(tt.length()));
        bw.flush();
        bw.close();
        br.close();

   
    }
}