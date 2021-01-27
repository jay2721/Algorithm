class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer =new int[1];
            answer[0]=-1;
            return answer;
        }
        else{
            int[] answer = new int[arr.length-1];
     
            int min=0;
            int index=0;

            for(int i=0;i<arr.length;i++){
                if(arr[i]<arr[min])
                    min=i;
            }

            for(int i=0;i<arr.length;i++){
                if(i==min)
                    continue;
                else
                    answer[index++]=arr[i];
            }
            return answer;
        }
        
    }
}