import java.util.*;

public class No_10872 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int answer= factorial(num);
		System.out.println(answer);
	}
	
	public static int factorial(int n) {
		if(n<=1)
			return 1;
		return n*factorial(n-1);
	}
}