import java.util.*;

public class No_1929 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
        
		boolean[] check=new boolean[b+1];
		check[0]=true;
		check[1]=true;
		
		for(int i=2;i<=b;i++) {
			if(check[i]==true)
				continue;
			for(int j=i+i;j<=b;j=j+i) {
				check[j]=true;
			}
		}
		
		for(int i=a;i<=b;i++) {
			if(check[i]==false)
				System.out.print(i+" ");
		}
					
	}

}
