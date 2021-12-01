class Solution {
    public String solution(int n) {
        String answer = "";

        while(n>0){
            int remainder=n%3;
            n/=3;
            if(remainder==0){
                remainder=4;
                n--;
            }
            answer=remainder+answer;
        }
        
        return answer;
    }
}