package BaekJoon;

import java.util.*;

public class No_11660 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[][] = new int[N+1][N+1];
		int sum[][] = new int[N+1][N+1];
		
		for(int i=1; i<N+1; i++) {
			for(int j=1; j<N+1; j++) {
				arr[i][j]=sc.nextInt();
				sum[i][j]=sum[i-1][j]+sum[i][j-1]+arr[i][j]-sum[i-1][j-1];
			}
		}
		
		for(int k=0; k<M; k++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int answer =sum[x2][y2]-sum[x1-1][y2]-sum[x2][y1-1]+sum[x1-1][y1-1];
			System.out.println(answer);
		}
		
	}
}
