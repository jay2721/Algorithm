import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt=Integer.bitCount(n);
        String binary=Integer.toBinaryString(n);
   
        // for(int i=0;i<binary.length();i++){
        //     char ch=binary.charAt(i);
        //     if(ch=='1')
        //         cnt++;
        // }
        
        while(true){
            n++;
            String next=Integer.toBinaryString(n);
            int n_cnt=Integer.bitCount(n);
            
            if(cnt==n_cnt){
                answer=n;
                break;
            }

        }
        return answer;
    }
}