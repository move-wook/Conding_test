
import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        // 1. 가장 작은 숫자 추출
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if(i != min){
                list.add(i);
            }
        }
        if(list.size() < 2) list.add(-1);
        return list; 
    }
}