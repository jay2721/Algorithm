import java.util.*;

public class No_2231 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(); 
		int answer = 0;
		
		for(int i=0;i<num;i++) {
			int n=i;
			int sum=0;
			while(n!=0) {
				sum+=n%10;
				n=n/10;
			}
			
			if((sum+i)==num) {
				answer=i;
				break;
			}
		}
		System.out.println(answer);
		
	}

}
