import java.util.*;

public class No_2798 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int [] arr = new int[N];
		
		int answer=0;
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		answer=search(arr,N,M);
		
		System.out.println(answer);

	}
	
	public static int search(int[] arr,int N, int M) {
		int result=0;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if (M == sum) {	
						return sum;
					}
					if(result < sum && sum < M) {
						result = sum;
					}
				}
			}
		}

		return result;
	}
}
