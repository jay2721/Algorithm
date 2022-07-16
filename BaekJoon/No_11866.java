import java.util.*;

public class No_11866 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		String answer="<";
		
		Queue<Integer> q=new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			for(int i=1;i<K;i++) {
				q.offer(q.poll());
			}
			answer+=q.poll();
			if(q.size()>0) {
				answer+=", ";
			}
		}
		answer+=">";
		System.out.println(answer);
	}
}
