import java.util.*;

public class No_10814 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);

		int N=sc.nextInt();
		String[][] arr=new String[N][2];

		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.next();	// 나이
			arr[i][1] = sc.next();	// 이름
		}

		Arrays.sort(arr, new Comparator<String[]>(){

			public int compare(String[] a, String[] b){
				return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
			}
		});


		for(int i=0;i<N;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}
}
