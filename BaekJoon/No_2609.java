import java.util.*;

public class No_2609 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N1=sc.nextInt();
		int N2=sc.nextInt();	
		
		int g=gcd(N1,N2);
		
		int lcm=(N1*N2/g);
		
		System.out.println(g);
		System.out.println(lcm);

	}
	
	//최대공약수
	public static int gcd(int A, int B) {
		if(B==0)
			return A;
		else
			return gcd(B,A%B);
	}

	
	
}
