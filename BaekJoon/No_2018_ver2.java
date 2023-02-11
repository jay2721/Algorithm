package BaekJoon;

import java.util.*;

public class No_2018_ver2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N=sc.nextInt();
		int answer=1;
		
		int left=1;
		int right=1;
		int sum=1;
		
		while (right !=N) {
			if(sum==N) {
				answer++;
				right++;
				sum+=right;
			}
			else if(sum>N) {
				sum-=left;
				left++;
			}
			else if(sum<N) {
				right++;
				sum+=right;
			}
		}
		
		System.out.print(answer);

	}

}
