class Solution {
    public int solution(int n) {   
        return fibonacci(n);
    }
    public static int fibonacci(int n) {
        int[] dp = new int[n + 1];
        int m = 1234567;
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i]  = (dp[i - 1] % m ) + (dp[i - 2] % m );
        }
        return dp[n] % m ;

    }
}