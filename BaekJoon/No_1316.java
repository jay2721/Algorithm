import java.util.*;

public class No_1316 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();

		int count=0;
		
		for(int i=0;i<N;i++) {

			String str= sc.next();
			boolean[] check=new boolean[26];
			
			for(int j=0;j<str.length()-1;j++) {
				if(str.charAt(j)!=str.charAt(j+1)) {
					if(check[str.charAt(j+1)-'a']==true) {
						count--;
						break;
					}
				}
				check[str.charAt(j)-'a']=true;
			}
			count++;
		}
		System.out.println(count);
	}

}
