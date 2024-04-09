class Solution {
    public long solution(long n) {
        String text = String.valueOf(n);
        
        int[] intArray = new int[text.length()]; // 결과를 저장할 배열
        for (int i = 0; i < text.length(); i++) {
                char str = text.charAt(i); // 문자열에서 한 글자씩 가져옴
                intArray[i] = Character.getNumericValue(str); // 문자를 정수로 변환하여 배열에 저장
        }

        for(int i = 0; i < intArray.length-1; i++) { // 입력받은 배열 반복 0 ~ 4까지
            // -i를 하는 이유 -> 제일 큰 수가 맨 마지막으로 정렬이 됨 (맨 마지막은 비교 안해도 됨)
            for(int j = 0; j < intArray.length-1-i; j++) { // 앞 숫자와 뒤 숫자 서로 비교할 반복문
                // ex) j = 0일 때, arr[0] > arr[0+1]로 앞자리가 숫자가 더 크다면
                if(intArray[j] < intArray[j+1]) {
                    // 값을 옮겨주기 위해 tmp 변수 선언하여 큰 숫자인 arr[0]에 있는 값을 담아준다.
                    int tmp = intArray[j];
                    // 그리고 비어있는 앞자리에 숫자가 작은 뒷자리 숫자를 arr[0]에 넣어준다.
                    intArray[j] = intArray[j+1];
                    // 임시로 tmp에 담아뒀던 큰 숫자를 arr[0+1]자리에 담아주면서 위치를 바꿔준다.
                    intArray[j+1] = tmp;
                }
            }
        }
        long answer = 0;
        for (int num : intArray) {
            answer = answer * 10 + num; // 자릿수를 고려하여 정수를 결합
        }
        return answer;

    }
}