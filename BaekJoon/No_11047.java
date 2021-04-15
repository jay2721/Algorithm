import java.util.*;

public class No_11047 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt(); 
		int K=sc.nextInt();
		Integer arr[]=new Integer[N];
		int count=0;
		
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		
		for(int i=0;i<N;i++) {
			if(arr[i]<=K) {
				count+=(K/arr[i]);
				K=K%arr[i];
			}
		}
		
		System.out.println(count);
	}
}
