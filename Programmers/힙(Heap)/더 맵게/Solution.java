import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i:scoville){
            heap.add(i);
        }
        
        while(heap.peek()<K){
            if(heap.size()==1)
                return -1;
            int first=heap.poll();
            int second=heap.poll();
       
            heap.add(first+(second*2));
            answer++;
        }
        
        if(heap.peek()<K)
            answer=-1;
        
        return answer;
    }
}