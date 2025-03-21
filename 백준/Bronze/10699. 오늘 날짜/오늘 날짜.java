import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public void solution() throws Exception{
		Date nowDate = new Date();
	
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(nowDate));
	}
	public static void main(String[] args) throws Exception {
		
		new Main().solution();
	}
}