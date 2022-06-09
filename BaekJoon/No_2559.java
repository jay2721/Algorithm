import java.util.*;
import java.io.*;

public class No_2559 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int answer=Integer.MIN_VALUE;
		
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int [] arr= new int[N];
		
		st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<=(N-K);i++) {
			int sum=0;
			for(int j=i;j<(i+K);j++) {
				sum+=arr[j];
			}
			answer=Math.max(answer, sum);
		}
		
		System.out.println(answer);
	}

}
