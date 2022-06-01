import java.util.*;

public class No_14425 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		HashSet<String> hs=new HashSet<>();
		
		String [] test= new String[M];
		
		for(int i=0;i<N;i++) {
			hs.add(sc.next());
		}
		
		for(int j=0;j<M;j++) {
			test[j]=sc.next();
			
			if(hs.contains(test[j]))
				count++;
		}
		
		
		System.out.println(count);
	}

}
