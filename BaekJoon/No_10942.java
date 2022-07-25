import java.io.*;
import java.util.*;

public class No_10942 {
	
	public static boolean check(int[] arr,int s, int e) {
		int left=s;
		int right=e;
		
		while(left<right) {
			if(arr[left]!=arr[right]) {
				return false;
			}
			else {
				left++;
				right--;
			}
		}
		return true;
	}

	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(reader.readLine());
		int[] arr= new int[N+1];
		
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
			
		int M=Integer.parseInt(reader.readLine());
		
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<M;i++) {
			st = new StringTokenizer(reader.readLine());
			
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			
			if(check(arr,s,e)) {
				sb.append("1\n");
			}
			else {
				sb.append("0\n");
			}
		}
		
		System.out.print(sb);
	}

}
