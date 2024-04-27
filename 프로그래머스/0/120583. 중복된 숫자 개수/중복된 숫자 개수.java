class Solution {
    public int solution(int[] array, int n) {
        return fun(array, n);
    }
    
    public int fun(int[] arry, int n){
        int count = 0;
        for(int i=0; i<arry.length; i++){
            if(arry[i] == n) count++;
        }
        return count;
    }
}