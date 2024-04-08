class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        /*int answer = 0;
        for(int i=0; i< absolutes.length; i++){
            for(int j=0; j<signs.length; j++){
                if(i==j){
                    if(signs[j]){
                        answer+=absolutes[j];
                    }else{
                        answer-=absolutes[j];
                    }
                }
            }
        }
        return answer;
        */
        int answer = 0;
        int arrLength = absolutes.length;

        for(int i=0;i<arrLength;i++){
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}