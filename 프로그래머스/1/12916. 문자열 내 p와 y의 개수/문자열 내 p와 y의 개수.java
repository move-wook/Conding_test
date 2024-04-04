class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int yCount = 0;
        int pCount = 0;
        for(int i=0; i<s.length(); i++){
            char txt = s.charAt(i);
            if('p' == txt || 'P' == txt){
                pCount++;
            }
            if('y' == txt || 'Y' == txt){
                yCount++;
            }
        }
        
        if(yCount != pCount){
            answer = false;
        }
        
        return answer;
    }
}