import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), nm = a * b;
        while (b != 0) { a %= b; int t = a; a = b; b = t; }
        System.out.println(a + "\n" + (nm / a));
    }
}