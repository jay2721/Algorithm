import java.util.*;

public class No_5086 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		while(true) {
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			
			if(num1==0&&num2==0)
				break;
			
			if(num2%num1==0)
				System.out.println("factor");
			else if(num1%num2==0)
				System.out.println("multiple");
			else
				System.out.println("neither");
		}

	}

}
