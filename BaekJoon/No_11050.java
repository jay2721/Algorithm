import java.util.*;

public class No_11050 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int K=sc.nextInt();
		
		int answer=0;
		
		answer=factorial(N) / (factorial(N - K) * factorial(K));
		System.out.println(answer);

	}
	
	public static int factorial(int N) {
		
		if(N<=1)
			return 1;
		
		return N*factorial(N-1);
	}

}
