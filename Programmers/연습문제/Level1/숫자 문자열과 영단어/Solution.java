class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] numwords={"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i=0;i<numwords.length;i++){
             s = s.replace(numwords[i], String.valueOf(i));
        }
        
        answer=Integer.parseInt(s);
        return answer;
    }
}