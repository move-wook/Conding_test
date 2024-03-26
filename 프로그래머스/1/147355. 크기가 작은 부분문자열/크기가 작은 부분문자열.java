class Solution {
    public int solution(String t, String p) {
        //t에서 p의 길이만큼 잘라낸다;
        int answer = 0;
        long pInt = Long.parseLong(p);
        for(int i=0; i <= t.length() - p.length(); i++){
            String cur = t.substring(i, p.length() + i);
            if (pInt >= Long.parseLong(cur)) {
                answer++;
            }
        }
        return answer;
    }
}