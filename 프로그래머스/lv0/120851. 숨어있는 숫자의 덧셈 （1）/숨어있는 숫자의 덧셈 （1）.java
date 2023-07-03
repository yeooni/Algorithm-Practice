class Solution {
    public int solution(String my_string) {
        int sum = 0; // 합을 저장할 변수 초기화
        
        // 문자열을 순회하면서 숫자인 경우에만 합산
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(Character.isDigit(ch)) { // 숫자인 경우
                int num = Character.getNumericValue(ch); // 문자를 숫자로 변환
                sum += num; // 합산
            }
        }
        
        return sum; // 합 반환
    }
}