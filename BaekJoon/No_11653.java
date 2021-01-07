import java.util.*;

public class No_11653 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int i=2;
		int num=sc.nextInt();
		
		while(num>=i) {
			if(num%i==0) {
				System.out.println(i);
				num=num/i;
			}
			else 
				i++;
			}
	}

}
