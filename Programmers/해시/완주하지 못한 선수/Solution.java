// 완주하지 못한 선수
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //오름차순 정렬 -> 해당 인덱스끼리 비교해 완주 여부 확인 가능
        Arrays.sort(participant); 
        Arrays.sort(completion);
        
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer+=participant[i];
                return answer; 
            } 
        }
        
        answer+=participant[participant.length-1];
        return answer;
    }
}