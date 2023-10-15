package BaekJoon;

import java.io.*;
import java.util.*;

public class No_25192 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());
        int answer=0;
        HashSet set = new HashSet();


        String enter = "ENTER";

        for(int i=0;i<N;i++){
            String msg = br.readLine();

            if(msg.equals(enter)){
                answer+=set.size();
                set.clear();
                continue;
            }
            set.add(msg);
        }

        answer+=set.size();

        System.out.println(answer);

    }
}
