import java.util.*;

public class No_2750 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int [] arr=new int[num];
		
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}