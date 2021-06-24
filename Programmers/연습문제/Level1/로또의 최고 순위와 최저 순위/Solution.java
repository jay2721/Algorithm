import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int[] match=new int[2];
        int zero=0;
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0)
                zero++;
        }
        
        for(int i=0;i<win_nums.length;i++){
            for(int j=0;j<lottos.length;j++){
                if(win_nums[i]==lottos[j]){
                    match[0]++;
                    match[1]++;
                }
            }
        }
        
        match[0]+=zero;
        
        for(int i=0;i<match.length;i++){
            if(match[i]==6)
                answer[i]=1;
            else if(match[i]==5)
                answer[i]=2;
            else if(match[i]==4)
                answer[i]=3;
            else if(match[i]==3)
                answer[i]=4;
            else if(match[i]==2)
                answer[i]=5;
            else
                answer[i]=6;
        }
        
        
        return answer;
    }
}