class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
       
        for(char a : s.toCharArray()) {
            if(a == '(') {
                count++;
            } else {
                count--;
            }
            if(count < 0) {
                return !answer;
            }
        }
        
        if(count != 0) {
            return !answer;
        }

        return answer;
    }
}