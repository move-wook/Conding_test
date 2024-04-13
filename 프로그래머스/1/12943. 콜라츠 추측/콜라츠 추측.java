class Solution {
    public int solution(long n) {
        int answer = 0;
        int i = 0;
        if(n == 0){
            answer = 0;
        }else{
            while(i<500) {
                if(n == 1){
                    break;
                }
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = n * 3 + 1;
                }
                answer++;
                i++;
            }
            if(i == 500){
                answer = -1; 
            }

        }
        return answer;
    }
}