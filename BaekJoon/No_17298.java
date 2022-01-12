import java.util.*;

public class No_17298 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack <Integer> stack=new Stack<Integer>();
		
		StringBuilder sb = new StringBuilder();
		
		int num=sc.nextInt();
		int[] arr=new int[num];
		int[] answer=new int[num];
		
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<num;i++) {
			while(!stack.isEmpty()&&arr[i]>arr[stack.peek()]) {

				answer[stack.pop()]=arr[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			answer[stack.pop()]=-1;
			
		}

		for(int i=0;i<num;i++) {
			sb.append(answer[i]).append(' ');
		}
		
		System.out.println(sb);
	}

}
