import java.util.*;

public class No_1436 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		int num=666;
		int result=0;
		
		while(result!=input) {
			String str=num+"";
			
			if(str.contains("666"))
				result++;
			num++;
		}
		
		System.out.println(num-1);
		
	}

}
