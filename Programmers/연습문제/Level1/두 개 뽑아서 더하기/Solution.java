import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sum;
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1; j<numbers.length;j++){
                sum=numbers[i]+numbers[j];
                if(!arr.contains(sum))
                    arr.add(sum);
            }
        }
        
        int[] answer = new int[arr.size()];
        
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}