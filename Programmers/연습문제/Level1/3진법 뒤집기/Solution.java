import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String num="";
        
        while(n>0){
            num+=n%3;
            n=n/3;
        }
        answer=Integer.parseInt(num, 3);
       
        return answer;
    }
}