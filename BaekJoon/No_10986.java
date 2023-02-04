package BaekJoon;

import java.util.*;

public class No_10986 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		long answer=0;
		

		long sum [] = new long[N];
		long count[] = new long[M];
		
		sum[0]=sc.nextInt();
		
		for(int i=1; i<N; i++) {
			int num=sc.nextInt();
			sum[i]=sum[i-1]+num;
		}
		
		for(int i=0;i<N;i++) {
			int r = (int) (sum[i]%M);
			
			if(r==0)
				answer++;
			count[r]++;
		}
		
		for(int i=0;i<M;i++) {
			if(count[i]>1)
				answer+=(count[i]*(count[i]-1)/2);
		}
		
		System.out.println(answer);
		
	}

}
