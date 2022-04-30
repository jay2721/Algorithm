import java.util.*;

public class No_1932 {

	static int [][] arr,check;
	static int n;
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		arr = new int[n][n];
		check = new int [n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			Arrays.fill(check[i], -1);
			
		}
		
		for(int i=0;i<n;i++) {
			check[n-1][i]=arr[n-1][i];
		}
		
		
		System.out.println(find(0,0));

	}
	
	public static int find(int depth, int i) {
		if(depth==n-1)
			return check[depth][i];
		if(check[depth][i]==-1)
			check[depth][i]=Math.max(find(depth+1,i), find(depth+1,i+1))+arr[depth][i];
		
		return check[depth][i];

	}

}
