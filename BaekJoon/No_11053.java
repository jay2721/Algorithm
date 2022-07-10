import java.util.*;

public class No_11053 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int[] nums =new int[N];
		int[] dp = new int[N];  
		int answer=1;

		for(int i=0;i<N;i++) {
			nums[i]=sc.nextInt();
			dp[i]=1;
		}
		
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(nums[i]<nums[j]) {
					dp[j]=Math.max(dp[j], dp[i]+1);
				}
			}
			answer=Math.max(answer, dp[i]);
		}
	
		System.out.println(answer);
	}
	
}
