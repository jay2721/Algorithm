import java.util.*;

public class No_1181 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr = new String[n];
		
		sc.nextLine();
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				//단어 길이가 같을 때
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
					//s1>s2 양수 반환
					//s1<s2 음수 반환
				} 
				else {
					return s1.length() - s2.length();
				}
			}
		});
 
		System.out.println(arr[0]);
		
		for (int i = 1; i < n; i++) {
			//중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
