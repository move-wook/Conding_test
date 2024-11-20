import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public String solution(int[] numbers) {
       List<String> stringList = Arrays.stream(numbers)
                 .mapToObj(String::valueOf)
                 .collect(Collectors.toList());

		stringList.sort((a, b) -> (b + a).compareTo(a + b));
        String answer = String.join("", stringList);
        if (answer.startsWith("0")) {
            answer = "0";
        }
		 return  answer;
    }
}