import java.util.*;

public class No_2581 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
        
		int result=0;
		int sum=0;
		int min=0;
		for(int num=a;num<=b;num++) {
			int count=0;
			if(num!=1) {
				for(int j=1;j<=num;j++) {
					if(num%j==0)
						count++;
				}
			}
			if(count==2) {
				if(result==0)
					min=num;
				result++;
				sum+=num;
			}
		}
		
		if(result!=0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else 
			System.out.println("-1");
	}
}
