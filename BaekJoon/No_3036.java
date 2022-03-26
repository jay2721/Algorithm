import java.util.*;

public class No_3036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int N= sc.nextInt();
		
		int first=sc.nextInt();
		
		for(int i=1;i<N;i++) {
			int num=sc.nextInt();
			
			System.out.println((first/gcd(first,num))+"/"+(num/gcd(first,num)));
		}
	}

	public static int gcd(int x, int y) {
		int a=0;
		while(y!=0) {
			a=x%y;
			x=y;
			y=a;
		}
		return x;
	}
}
