import java.util.*;

public class No_1149 {

	static int[][] cost;
	static int[][] dp;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N=sc.nextInt();
		
		cost=new int[N][3];
		dp=new int[N][3];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<3;j++) {
				cost[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			dp[0][i]=cost[0][i];
		}
		
		System.out.print(Math.min(dpcost(N-1, 0), Math.min(dpcost(N-1, 1), dpcost(N-1, 2))));
		
	}
	
	public static int dpcost(int n, int color) {
		
		if(dp[n][color]==0) {
			if(color==0) {
				dp[n][color]=Math.min(dpcost(n-1,1), dpcost(n-1,2))+cost[n][color];
			}
			else if(color==1) {
				dp[n][color]=Math.min(dpcost(n-1,0), dpcost(n-1,2))+cost[n][color];
			}
			else if(color==2) {
				dp[n][color]=Math.min(dpcost(n-1,0), dpcost(n-1,1))+cost[n][color];
			}
		}
		
		return dp[n][color];
	}

}
