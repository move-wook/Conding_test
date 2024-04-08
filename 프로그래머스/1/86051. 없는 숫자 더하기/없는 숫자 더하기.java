import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        //간단하게 총합에서 배열에 있는 수를 빼면 간단함 ... 역시 논리적으로 고여버리면 끝나네
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
        //스트림으로 처리한 코드는 시간이 오래 걸림
        /*
        return IntStream.rangeClosed(0, 9)
                        .filter(item -> Arrays.stream(numbers).noneMatch(number -> number == item))
            .sum();*/
    }
}