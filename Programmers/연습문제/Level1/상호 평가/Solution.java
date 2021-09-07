import java.util.*;

class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        
        for(int i=0;i<scores.length;i++){
            int sum=0;
            int min=101;
            int max=-1;
            int self=scores[i][i];
            int length=scores.length;
            boolean check=true; 
            
            for(int j=0;j<scores.length;j++){
                min=Math.min(scores[j][i],min);
                max=Math.max(scores[j][i],max);
                
                if(i!=j&&self==scores[j][i])
                    check=false;
                
                sum += scores[j][i];  
            }
            
            if(check&&(max==self||min==self)){
                    length-=1;
                    sum-=self;
            }
            
           // System.out.println(sum/length);
            if((sum/length)>=90)
                answer+="A";
            else if(sum/length>=80&&sum/length<90)
                answer+="B";
            else if(sum/length>=70&&sum/length<80)
                answer+="C";
            else if(sum/length>=50&&sum/length<70)
                answer+="D";
            else
                answer+="F";

        }
        
        
        return answer;
        
    }
}