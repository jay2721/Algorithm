import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        double number=Math.sqrt(n);
        
        if(number%1>0)
            answer=-1;
        else 
            answer=(long)Math.pow(number+1,2);
        return answer;
    }
}