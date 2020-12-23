package BaekJoon;

import java.util.*;

public class No_2839 {
	public static void main(String args[]){
        int weight = 0; 
        int count = 0;
        Scanner sc = new Scanner(System.in);
        weight = sc.nextInt();
        
        while(true) {
            if (weight % 5 ==0) {
                System.out.println(weight/5 + count);
                break;
            }else if(weight <= 0) {
                System.out.println(-1);
                break;
            }
            weight-=3;
            count++;
        }
    }
}
