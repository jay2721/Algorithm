class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
	//String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어서 반환
	//toString() - 대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력
        int i=0;
  
        while(n>0){
            answer[i]=(int)(n%10);
            i++;
            n=n/10;
        }
        
        return answer;
    }
}