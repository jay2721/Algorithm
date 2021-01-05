import java.util.*;

public class No_5622 {
	public static void main(String args[]){
		int [] count= {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,77,8,8,8,9,9,9,9};
		int sum=0;
		Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	    String [] arr;
	    
	    arr=input.split("");
	   
	    for(int i=0;i<arr.length;i++) {
	    	sum+=count[arr[i].charAt(0)-'A'];
	    }
	    
	    sum+=arr.length;
	    System.out.println(sum);
	    
	}
}