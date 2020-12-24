<<<<<<< HEAD
package BaekJoon;
//¹úÁý

import java.util.*;

public class No_2292 {
	public static void main(String[] args){
        int input=0;
        int count=1;
        int circle=1;
        int number=6;
        
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        
        while(true) {
        	if(input<=circle)
        		break;
        	circle+=number;
        	number+=6;
        	count++;
        }
        System.out.println(count);
    }
}
=======
package BaekJoon;
//¹úÁý

import java.util.*;

public class No_2292 {
	public static void main(String[] args){
        int input=0;
        int count=1;
        int circle=1;
        int number=6;
        
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        
        while(true) {
        	if(input<=circle)
        		break;
        	circle+=number;
        	number+=6;
        	count++;
        }
        System.out.println(count);
    }
}
>>>>>>> 72be617bd2adc8d016aaaaa7d0dd90e44614f33f
