class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean[] check=new boolean[n+1];
		check[0]=true;
		check[1]=true;
		
		for(int i=2;i<=n;i++) {
			if(check[i]==true)
				continue;
			for(int j=i+i;j<=n;j=j+i) {
				check[j]=true;
			}
		}
		
		for(int i=1;i<=n;i++) {
			if(check[i]==false)
				answer++;
		}

        return answer;
    }
}