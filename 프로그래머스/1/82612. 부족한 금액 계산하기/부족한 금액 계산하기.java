import java.util.stream.IntStream;
class Solution {
    public long solution(int price, int money, int count) {
        long num = 0;
        for(int i=1; i <= count; i++){
            num += i * price;
        }
        long answer = money - num;
        return  answer < 0 ? answer*(-1) : 0; 
    }
}