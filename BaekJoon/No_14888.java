import java.util.*;

public class No_14888 {

	public static int N;
	public static int [] A;
	public static int [] B=new int[4];
	public static int MAX = Integer.MIN_VALUE;	
	public static int MIN = Integer.MAX_VALUE;	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		N=sc.nextInt();
		A=new int[N];
		
		for(int i=0; i<N;i++) {
			A[i]=sc.nextInt();
		}
		
		for(int i=0;i<4;i++) {
			B[i]=sc.nextInt();
		}
		
		dfs(A[0], 1);
		 
		System.out.println(MAX);
		System.out.println(MIN);
			
	}
	
	public static void dfs(int num, int idx) {
		if (idx == N) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
 
		for (int i = 0; i < 4; i++) {
			if (B[i] > 0) {
				B[i]--;
				switch (i) {
 
				case 0:	
					dfs(num + A[idx], idx + 1);	
					break;
				case 1:	
					dfs(num - A[idx], idx + 1);	
					break;
				case 2:	
					dfs(num * A[idx], idx + 1);	
					break;
				case 3:	
					dfs(num / A[idx], idx + 1);	
					break;
 
				}
		
				B[i]++;
			}
		}
	}
}
