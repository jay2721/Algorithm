import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list =new ArrayList<>();
        int[] s1={1,2,3,4,5};
        int[] s2={2,1,2,3,2,4,2,5};
        int[] s3={3,3,1,1,2,2,4,4,5,5};
        
        int[] count=new int[3];
        int high;

        for(int i=0;i<answers.length;i++){
            if(answers[i]==s1[i%5])
                count[0]++;
            if(answers[i]==s2[i%8])
                count[1]++;
            if(answers[i]==s3[i%10])
                count[2]++;
        }
        
        high=count[0];
        for(int i=0;i<count.length;i++){
            if(high<count[i])
                high=count[i];
           
        }
       
        
        for(int i=0; i<count.length;i++){
            if(high==count[i])
                list.add(i+1);  
        }
        
        int[] answer=new int[list.size()];
       
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}