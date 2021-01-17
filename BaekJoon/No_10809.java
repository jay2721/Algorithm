import java.util.*;

public class No_10809 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int [] alpha=new int[26];
		String str=sc.next();
		
		for(int i = 0; i < alpha.length; i++){
			alpha[i] = -1;
		}
		
		for(int i=0;i<str.length();i++) {
			if(alpha[str.charAt(i)-'a']==-1)
				alpha[str.charAt(i)-'a']=i;
		}
		
		for(int i = 0; i < alpha.length; i++){
			System.out.print(alpha[i]+" ");
		}
	}
}