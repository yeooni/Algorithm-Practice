class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mulSum = 1;
        
        for(int i = 0; i<num_list.length;i++){
            sum +=num_list[i];
            mulSum *=num_list[i];
        }
        if(sum * sum > mulSum){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}