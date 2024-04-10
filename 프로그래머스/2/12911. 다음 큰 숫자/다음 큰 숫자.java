class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);
      
        int index = 1;
        while (true) {
            int number = n + index;
            if (count == Integer.bitCount(number)) {
                answer = number;
                break;
            }
            index++;
        }
        return answer;
    }
}