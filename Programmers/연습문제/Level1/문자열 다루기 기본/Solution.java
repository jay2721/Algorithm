class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()!=4&&s.length()!=6)
            answer=false;
        for(int i=0;i<s.length();i++){
            char word=s.charAt(i);
            if(word<'0'||word>'9')
                answer=false;
        }
        return answer;
    }
}