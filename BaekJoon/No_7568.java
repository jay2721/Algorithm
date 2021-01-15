import java.util.*;

public class No_7568 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int[][] arr=new int[num][2];
		int[] rank=new int[num];

		for(int i=0;i<num;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==j)
					continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) 
					rank[i]++;
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.print((rank[i]+1)+" ");
		}
		
		
	}
}