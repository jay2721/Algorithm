import java.util.*;

public class No_2675 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int count = 0;
		String str;
		
		for(int i=0;i<num;i++) {
			count=sc.nextInt();
			str=sc.next();
			for(int j=0;j<str.length();j++) {
				for(int k=0;k<count;k++)
					System.out.print(str.charAt(j));	
			}
			System.out.println();
		}
		
	}
}