class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            char word=s.charAt(i);
            if(word >= 'a' && word <= 'z') {
	   if(word + n > 'z') 
                    answer += (char)(word + n-26);
                else 
                    answer+=(char)(word+n);
            }
            else if(word >= 'A' && word <= 'Z'){
                if(word + n > 'Z') 
                    answer += (char)(word + n-26);
                else 
                    answer+=(char)(word+n);
            }
            else 
                answer += (char)word;
        }
        return answer;
    }
}