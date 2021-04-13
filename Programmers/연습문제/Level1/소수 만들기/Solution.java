class Solution {
    public boolean isPrime(int a){
        for(int i=2;i<a;i++){
          if (a % i == 0) 
              return false;
        }
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                  sum=nums[i]+nums[j]+nums[k];
                    if(isPrime(sum)==true){
                        //System.out.println(sum);
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}