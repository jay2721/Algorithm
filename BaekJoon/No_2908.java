import java.util.*;

public class No_2908 {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		StringBuffer a=new StringBuffer(sc.next());
		StringBuffer b=new StringBuffer(sc.next());
		//StringBuffer는 가변성을 갖기때문에 쉽게 문자열 수정,추가,삭제 가능
		//String은 불변성(할당된 공간 불변) StringBuffer는 가변성(버퍼의 크기 유연하게 변경)
		
		int num1=Integer.parseInt(a.reverse().toString());
		int num2=Integer.parseInt(b.reverse().toString());
		
		if(num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
	}
}
