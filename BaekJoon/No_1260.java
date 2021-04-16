import java.util.*;

public class No_1260 {
	
	public static int arr[][];
	public static boolean visited[];
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		int V=sc.nextInt();
		
		arr=new int[N+1][N+1];
		
		for(int i=1;i<=M;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
		
//		for(int i=1; i<arr.length;i++) { 
//			for(int j=1;j<arr.length;j++) {
//				System.out.print(arr[i][j]);
//		}
//		System.out.println();
//	}
	
		
		visited=new boolean[N+1];
		dfs(V);
		
		System.out.println("");
		
		visited = new boolean[N+1];
		bfs(V); 
	}
	
	public static void dfs(int n) {
		visited[n]=true;
		System.out.print(n+" ");

		for(int i=1;i<arr.length;i++) {
			if(arr[n][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int n) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		visited[n]=true;
		System.out.print(n+" ");
		
		while(!queue.isEmpty()) {
			int a= queue.poll();
			for(int i=1; i<arr.length;i++) {
				if(arr[a][i] ==1 && visited[i] == false) {
					queue.add(i);
					visited[i] = true;
					System.out.print(i+ " ");
				}
			}
		}
	}
}
