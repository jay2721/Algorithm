import java.util.*;

public class No_11399 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int arr[]=new int[N];
		int min=0;
		int sum=0;
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			min+=arr[i];
			sum+=min;
		}
		
		System.out.println(sum);
		
		
	}

}