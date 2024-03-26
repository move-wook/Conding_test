import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list)
                .boxed() // 기본 타입 -> 래퍼 타입
                .collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}