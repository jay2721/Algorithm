import java.util.*;

public class No_1292 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		int answer=0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=B;i++) {
			for(int j=1;j<=i;j++) {
				list.add(i);
			}
		}
		
		for(int i=A;i<=B;i++) {
			answer+=list.get(i-1);
		}
		
		System.out.println(answer);
	}

}
