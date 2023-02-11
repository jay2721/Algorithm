package BaekJoon;

import java.util.*;

public class No_1253 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int N= sc.nextInt();
		int answer=0;
		
		int A[] = new int[N];
		

		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		
		Arrays.sort(A);
	
		for(int i=0;i<N;i++) {
			int left=0;
			int right=N-1;
			int target = A[i];
			
			while(left<right) {
				
				int sum=A[left]+A[right];
				
				if(sum<target)
					left++;
				
				else if(sum>target)
					right--;
				
				else {
					if(left!=i && right!=i) {
						answer++;
						break;
					}
					
					if(left==i)
						left++;
					
					if(right==i)
						right--;
				}
				
			}
			
		}
		
		
		System.out.println(answer);

	}

}
