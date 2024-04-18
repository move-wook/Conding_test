class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i < a.length; i++){
            answer += a[i] * b[i];
        }
        //스트림을 활용한 풀이방법 
        //IntStream 을 활용해서 a의 길이만큼 반복하면서 map 을통해 중간연산 작업을 거친 총합을 구하는 메서드를 호출해서 처리
        //IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum(); 
        
        return answer;
    }
}