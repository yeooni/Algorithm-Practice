class Solution {
    public int solution(int a, int b) {

        String answer1 = Integer.toString(a) + Integer.toString(b);
        int answer2 = Integer.valueOf(answer1);
        
        if(answer2 >= 2 * a * b) {
            return answer2;
        } else {
            return 2 * a * b;
        }

    }
}