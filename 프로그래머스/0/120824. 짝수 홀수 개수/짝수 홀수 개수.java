class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [2];
		int num = 0;
		int num2 = 0;
		for(int i : num_list){
			if(i % 2 == 0 ){
				num++;
			}else{
				num2++;
			} 
		}
		answer[0] = num;
		answer[1] = num2;
        		
        return answer;
    }
}