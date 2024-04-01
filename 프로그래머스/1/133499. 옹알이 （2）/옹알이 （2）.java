class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            /*
            예를 들어, aya(?!aya)는 "aya" 문자열을 찾되, 그 뒤에 바로 "aya"가 오지 않는 경우를 의미합니다.
            (?!...)는 긍정형 전방탐색(Positive Lookahead)의 반대인 부정형 전방탐색(Negative Lookahead)입니다. 
            즉, 특정 문자열 뒤에 바로 오는 다른 문자열을 제외하는 조건을 만듭니다.
            */
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }

        return answer;
    }
}
