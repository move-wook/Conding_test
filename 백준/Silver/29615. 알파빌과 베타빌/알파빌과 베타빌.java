import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] friend = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            friend[i] = Integer.parseInt(st.nextToken());
        }
        //[12345]
        //[34]
        int count = 0;
        for(int i = 0; i < friend.length; i++){
            for(int j = 0; j < friend.length; j++){
                if(friend[i] == arr[j]){
                    count++;
                }
            }

        }

        sb.append(friend.length - count).append("\n");
        System.out.print(sb);
    }
}