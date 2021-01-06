import java.util.*;

public class No_1157 {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		int max=-1;
		int [] count =new int[26];
		String word=sc.next();
		char alpha='?';
	 
	    for(int i=0;i<word.length();i++) {
	    	if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
	    		count[word.charAt(i)-'A']++;
	    	}
	    	else if('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
	    		count[word.charAt(i)-'a']++;
	    	}
	    }
	    
	    for(int i=0;i<count.length;i++) {
	    	if(max<count[i]) {
	    		max=count[i];
	    		alpha=(char)(i+'A');
	    	}
	    	else if (max==count[i]) {
	    		alpha='?';
	    	}
	    }
	    System.out.println(alpha);
	}
}
