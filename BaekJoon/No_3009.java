import java.util.*;

public class No_3009 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] x=new int[3];
		int[] y=new int[3];
		int ax = 0,ay=0;
		
		for(int i=0;i<3;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		
		if(x[1]==x[2])
			ax=x[0];
		else if(x[0]==x[1])
			ax=x[2];
		else if(x[0]==x[2])
			ax=x[1];
		
		if(y[1]==y[2])
			ay=y[0];
		else if(y[0]==y[1])
			ay=y[2];
		else if(y[0]==y[2])
			ay=y[1];
		
		System.out.println(ax+" "+ ay);
		
	}
}
