package BaekJoon;

import java.util.*;
import java.io.*;

public class No_1305 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int answer =0;
        
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        int last = solve(str);
        answer = L-last;
        
        System.out.println(answer);
    }
    
    public static int solve(String str) {
    	int len = str.length();
    	
    	int j=0;
    	int[] pi = new int[len];
    	
    	for(int i=1;i<len;i++) {
    		while(j>0 && str.charAt(j)!=str.charAt(i)) {
    			j=pi[j-1];
    		}
    		
    		if(str.charAt(j)==str.charAt(i)) {
    			pi[i]= ++j;
        	}
    	}
    	
    	
    	return pi[len-1];
    }
}
