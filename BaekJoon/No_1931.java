import java.util.*;

public class No_1931 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int[][] time= new int[N][2];
		int answer=0;
		int end=0;
		for(int i=0;i<N;i++) {
			time[i][0]=sc.nextInt();
			time[i][1]=sc.nextInt();
		}

		Arrays.sort(time, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {

				if(a[1] == b[1])
					return a[0] - b[0];
				
				return a[1] - b[1];
			}
		});
		
		for(int i=0;i<N;i++) {
			if(end<=time[i][0]) {
				end=time[i][1];
				answer++;
			}
		}
		
		System.out.println(answer);

	}
}
