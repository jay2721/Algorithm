import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String phone: phone_book){
            hm.put(phone,hm.getOrDefault(phone, 0)+1);
        }
        
        for(String phone: phone_book){
            for(int i=1;i<phone.length();i++){
                String first = phone.substring(0,i);
                if(hm.containsKey(first))
                    answer=false;
            }
        }
        return answer;
    }
}