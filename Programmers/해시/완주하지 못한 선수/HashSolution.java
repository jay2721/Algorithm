import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hash= new HashMap<>();
        
        for(String person: participant){
            hash.put(person,hash.getOrDefault(person, 0)+1);
        }
        
        for(String person: completion){
            hash.put(person, hash.getOrDefault(person, 0)-1);
        }
        
        for(String key:hash.keySet()){
            if(hash.get(key)>0){
                answer=key;
                break;
            }
        }
        
        return answer;
    }
}