class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String [] day={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int [] last={31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        int count=0;
        for(int i=0;i<a-1;i++){
            count+=last[i];
        }
        count+=b+4;
        answer=day[count%7];
        return answer;
    }
}