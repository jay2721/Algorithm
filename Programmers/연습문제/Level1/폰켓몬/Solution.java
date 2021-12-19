import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt=(nums.length)/2;
        ArrayList list =new ArrayList();
        
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i]))
                list.add(nums[i]);
        }
        
        if(list.size()>cnt)
            answer=cnt;
        else 
            answer=list.size();
        
        return answer;
    }
}