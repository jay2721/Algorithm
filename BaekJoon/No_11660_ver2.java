package BaekJoon;

import java.util.*;
import java.io.*;

public class No_11660_ver2 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
	
		int arr[][] = new int[N+1][N+1];
		int sum[][] = new int[N+1][N+1];
		
		for(int i=1; i<N+1; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=1; j<N+1; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				sum[i][j]=sum[i-1][j]+sum[i][j-1]+arr[i][j]-sum[i-1][j-1];
			}
		}
		
		for(int k=0; k<M; k++) {
			
			st=new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int answer =sum[x2][y2]-sum[x1-1][y2]-sum[x2][y1-1]+sum[x1-1][y1-1];
			sb.append(answer + "\n");
		}
		
		System.out.println(sb);
	}
}
