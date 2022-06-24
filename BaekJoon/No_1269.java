import java.util.*;

public class No_1269 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int count=0;
		
		int acnt=sc.nextInt();
		int bcnt=sc.nextInt();
		
		HashSet<Integer> A = new HashSet<>();
		HashSet<Integer> B = new HashSet<>();
		
		for(int i=0;i<acnt;i++) {
			A.add(sc.nextInt());
		}
		
		for(int i=0;i<bcnt;i++) {
			B.add(sc.nextInt());
		}
		
		for(Integer b:B) {
			if(!A.contains(b))
				count++;
		}
		
		for(Integer a:A) {
			if(!B.contains(a))
				count++;
		}
		
		System.out.println(count);
		
	}

}
