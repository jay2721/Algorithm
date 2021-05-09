import java.util.*;

public class No_1085 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		int xmin=Math.min(x, w-x);
		int ymin=Math.min(y, h-y);
		
		int answer=Math.min(xmin, ymin);
		System.out.println(answer);
		
	}
}
