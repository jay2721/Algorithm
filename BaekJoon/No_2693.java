import java.util.*;

public class No_2693 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<T;i++) {
			list.clear();
			for(int j=0;j<10;j++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list,Collections.reverseOrder());
			System.out.println(list.get(2));
		}

	}

}
