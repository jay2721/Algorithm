import java.util.*;

public class No_2018 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N=sc.nextInt();
		int answer=0;
		
		int left=1;
		int right=1;
		int sum=1;
		
		while(left<=right) {
			if(sum==N) {
				answer++;
			}
			if(sum<N) {
				right++;
				sum+=right;
			}
			else if(sum>=N) {
				sum-=left;
				left++;
			}
		}
		
		System.out.print(answer);

	}

}
