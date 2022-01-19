package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No_18258 {

	public static void main(String[] args) throws IOException {
		
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		Deque<Integer> que = new LinkedList<Integer>();
		
		int cnt=Integer.parseInt(br.readLine());
		int[] arr= new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine(), " ");
			String str=st.nextToken();
			if(str.equals("push")) {
				int num=Integer.parseInt(st.nextToken());
				que.add(num);
			}else if(str.equals("pop")) {
				if(!que.isEmpty()) {
					sb.append(que.poll()+"\n");
				}
				else {
					sb.append(-1+"\n");
				}
			}
			else if(str.equals("size")) {
				sb.append(que.size()+"\n");
			}
			else if(str.equals("empty")) {
				if(!que.isEmpty()) {
					sb.append(0+"\n");
				}
				else
					sb.append(1+"\n");
			}
			else if(str.equals("front")) {
				if(!que.isEmpty())
					sb.append(que.peek()+"\n");
				else 
					sb.append(-1+"\n");
			}
			else if(str.equals("back")) {
				if(!que.isEmpty())
					sb.append(que.getLast()+"\n");
				else 
					sb.append(-1+"\n");
			}
		}
		System.out.println(sb);
		
		
		
	}

}
