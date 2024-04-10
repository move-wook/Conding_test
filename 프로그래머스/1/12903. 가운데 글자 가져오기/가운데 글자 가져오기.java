class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int leng = s.length();
        if(leng % 2 == 0){
            int half = (int)Math.round(leng / 2) -1 ;
            answer.append(s.charAt(half));
            answer.append(s.charAt(half+1));
        }else{
            int half = (int)Math.round(leng / 2) ;
            answer.append(s.charAt(half));
        }
        
        return answer.toString();
    }
}