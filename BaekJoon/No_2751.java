import java.util.*;

public class No_2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		for(int i=0;i<arr.size();i++) {
			sb.append(arr.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}

}
