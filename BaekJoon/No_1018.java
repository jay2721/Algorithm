package BaekJoon;

import java.util.*;

public class No_1018 {
	public static boolean[][] arr;
	static int num=64;
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		arr= new boolean[a][b];
		
		sc.nextLine(); //문자열 입력하기 전에 개행제거
		
	    for(int i=0;i<a;i++) {
            String str = sc.nextLine();
            for(int j=0;j<b;j++) {
            	if (str.charAt(j) == 'W') {
					arr[i][j] = true;		// W일 때 true 
				} else {
					arr[i][j] = false;		// B일 때 false
				}
            	
            }
        }
        
        for(int i=0;i<a-7;i++) {
            for(int j=0;j<b-7;j++) {
               check(i,j);
            }
        }

		System.out.println(num);
      
		
	}
	
	public static void check(int x, int y) {
	
		int count = 0;
		boolean color =arr[0][0];
		
		for (int i = x; i <x+8; i++) {
			for (int j = y; j < y+8; j++) { 
				if (arr[i][j] != color) {	
					count++;
				}
				color = (!color);
			}
			color = !color;
		}
		
		count = Math.min(count, 64 - count);

		num = Math.min(num, count);
		
	}
}
