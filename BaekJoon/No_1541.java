import java.util.*;
import java.io.*;

public class No_1541 {
	public static void main(String args[])throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int result=Integer.MIN_VALUE; //int의 최솟값
		String input=br.readLine();
		StringTokenizer str=new StringTokenizer(input,"-");
		
		while(str.hasMoreTokens()) {
			int sum=0;
			StringTokenizer str2=new StringTokenizer(str.nextToken(),"+");
	
			while(str2.hasMoreTokens()) {
				sum+=Integer.parseInt(str2.nextToken());
			}		
			
			if(result==Integer.MIN_VALUE)
				result=sum;
			else {
				result-=sum;
//				System.out.println("r"+result+" s"+sum);
			}
		}
		
		System.out.println(result);
	}
}
