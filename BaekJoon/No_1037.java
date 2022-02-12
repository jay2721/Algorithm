import java.util.*;

public class No_1037 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count= sc.nextInt();
		
		int [] arr =new int[count];
		
		int answer=0;
		
		for(int i=0;i<count;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.parallelSort(arr);
		
		int max=arr[count-1];
		int min=arr[0];
		
		answer=max*min;
		
		System.out.println(answer);
	}
	
}
