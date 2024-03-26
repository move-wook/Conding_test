import java.util.stream.DoubleStream;
import java.util.Arrays;
class Solution {
    public double solution(int[] numbers) {
        DoubleStream intStream = Arrays.stream(numbers).asDoubleStream();
        return (intStream.sum()/numbers.length);
  
    }
}