import java.util.*;

public class No_2164 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Queue<Integer> que=new LinkedList<>();
		
		int N=sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			que.add(i);
		}
		
		while(que.size()>1) {
			que.poll();
			que.add(que.poll());
		}
		
		System.out.println(que.poll());
		
	}

}
