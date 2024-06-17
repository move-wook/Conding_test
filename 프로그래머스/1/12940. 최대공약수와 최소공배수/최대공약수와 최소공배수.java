class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m), n*m/gcd(n,m)};
        return answer;
    }
    
    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }
}