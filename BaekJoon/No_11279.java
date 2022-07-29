import java.util.*;

public class No_11279 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0; i<N;i++) {
			int x=sc.nextInt();
			if(x==0) {
				if(que.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(que.poll());
				}
			}
			else {
				que.add(x);
			}
		}
	}

}
