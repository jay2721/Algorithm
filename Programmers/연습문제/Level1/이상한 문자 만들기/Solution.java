import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String [] arr=s.split("");
        int index=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(" "))
                index=0;        
            else{
                index++;
                if(index%2!=0)
                    arr[i]=arr[i].toUpperCase(); 
                else
                    arr[i]=arr[i].toLowerCase();
            }
             answer+=arr[i];
        }
      
        return answer;
    }
}