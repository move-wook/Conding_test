import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {

        return IntStream.rangeClosed(0, 9)
                        .filter(item -> Arrays.stream(numbers).noneMatch(number -> number == item))
            .sum();
    }
}