import java.util.*;
public class No_2579 {

	static int [] score;
	static int [] dp;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		
		score=new int[N+1];
		dp=new int[N+1];
		
		for(int i=1;i<N+1;i++) {
			score[i]=sc.nextInt();
		}
		
		dp[0]=score[0];
		dp[1]=score[1];
		
		if(N>=2) {
			dp[2]=score[1]+score[2];
		}
		
		System.out.println(step(N));
	}
	
	public static int step(int n) {
		
		if(n>=3){
			if(dp[n]==0)
				dp[n]=Math.max(step(n-2),step(n-3)+score[n-1])+score[n];
		}
		return dp[n];
	}

}
