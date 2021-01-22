import java.util.*;

public class No_1978 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
        		int [] input=new int[num];
		int result=0;
		for(int i=0;i<num;i++) {
			input[i]=sc.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			int count=0;
			if(input[i]!=1) {
				for(int j=1;j<=input[i];j++) {
					if(input[i]%j==0)
						count++;
				}
			}
			if(count==2)
				result++;
		}
		System.out.println(result);
	}
}
