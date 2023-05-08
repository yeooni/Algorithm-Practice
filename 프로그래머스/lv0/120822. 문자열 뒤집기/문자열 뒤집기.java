class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        char[] reverse = new char[ch.length];
        
        for(int i = 0; i < ch.length; i++){
            reverse[i] = ch[ch.length -i -1];
        }
        answer = new String(reverse);
        
        return answer;
    }
}