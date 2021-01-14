import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String arr=""+n;
        String [] temp =arr.split("");
        Arrays.sort(temp,Collections.reverseOrder());
        answer=Long.parseLong(String.join("",temp));
        return answer;
    }
}