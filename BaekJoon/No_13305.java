import java.util.*;

public class No_13305 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] city=new int[N-1];
		int[] cost=new int[N];
		
		long sum=0;
		
		for(int i=0;i<N-1;i++) {
			city[i]=sc.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			cost[i]=sc.nextInt();
		}
		
		long min=cost[0];
		
		for(int i=0;i<N-1;i++) {
			if(cost[i]<min)
				min=cost[i];
			sum+=(min*city[i]);
		}
		
		System.out.println(sum);
	}
}
