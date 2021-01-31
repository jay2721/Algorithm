import java.util.*;

public class No_1427 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		String num=sc.nextLine();
		String [] str=num.split("");
		Integer [] arr=new Integer[str.length];
		//integer: 클래스(Wrapper)타입(int의 객체형) (null처리 가능), int: long double형과 같은 원시형변수 (null 처리 불가)
		
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		
	}

}