import java.util.*;

public class No_2606 {
	public static int arr[][];
	public static boolean visited[];
	public static int count=0;
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int com=sc.nextInt();
		int N=sc.nextInt();

		arr=new int[com+1][com+1];
		
		for(int i=1;i<=N;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
		
		
		visited=new boolean[com+1];
		dfs(1);
		
		System.out.println(count+"");
	}
	
	public static void dfs(int n) {
		
		visited[n]=true;
		//System.out.print(n+" ");

		for(int i=1;i<arr.length;i++) {
			if(arr[n][i] == 1 && visited[i] == false) {
				dfs(i);
				count++;
			}
		}
	}
}
