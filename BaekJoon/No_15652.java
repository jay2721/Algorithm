import java.util.*;

public class No_15652 {
	public static int N;
	public static int M;
	public static int[] arr;
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		N=sc.nextInt();
		M=sc.nextInt();
		
		arr=new int[M];
		
		dfs(1,0);
	}
	
	public static void dfs(int point, int depth) {
		if(M==depth) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println("");
			return;
		}
		
		for(int i=point;i<=N;i++) {
			arr[depth]=i;
			dfs(i,depth+1);
		}
		
	}
}
