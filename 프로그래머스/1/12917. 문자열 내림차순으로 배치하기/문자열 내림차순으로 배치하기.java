class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray(); // 문자열을 문자 배열로 변환
        // 문자 배열을 아스키 코드 값으로 기준으로 정렬
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] < charArray[j]) {
                    // 문자 위치 교환
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        // 정렬된 문자 배열을 문자열로 변환하여 반환
        return new String(charArray);
    }
}