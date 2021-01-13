import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        ArrayList<Integer> list=new ArrayList<Integer>();
        int num=arr[0];
        list.add(num);
        
        for(int i=1;i<arr.length;i++){
            if(num!=arr[i]){
                num=arr[i];
                list.add(num);
            }    
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
            //System.out.println(answer[i]);
        }

        return answer;
    }
}