import java.util.*;

public class No_1152 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		
		StringTokenizer strToken = new StringTokenizer(str, " ");
		//StringTokenizer 클래스: 문자열을 지정된 구분자로 문자열을 나눠주는 것. 나눠진 문자열: 토큰(token)
	    System.out.println(strToken.countTokens());
	    //countTokens: token의 개수를 반환	
	}

}
