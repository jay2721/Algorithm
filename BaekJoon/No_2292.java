
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

