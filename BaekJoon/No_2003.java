import java.util.*;

public class No_2003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		int sum=0;
		int answer=0;
		
		int[] num= new int[N];
		
		for(int i=0;i<N;i++) {
			num[i]=sc.nextInt();
		}
		
		int left=0;
		
		for(int right=0;right<N;right++) {
			sum+=num[right];
			while(sum>M) {
				sum-=num[left];
				left++;
			}
			if(sum==M) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
