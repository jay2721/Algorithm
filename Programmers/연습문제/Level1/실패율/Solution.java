import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        ArrayList<Double> rate = new ArrayList<Double>(); 
        double[] fail=new double[N];
        
        for(int n=1;n<N+1;n++){
            int people=0;
            int stop=0;
           
            for(int i=0;i<stages.length;i++){
                if(stages[i]>=n){
                    people++;
                    if(stages[i]==n)
                        stop++;
                }
                
            }
            if(people!=0)
                rate.add((double)stop/(double)people);
            else
                rate.add(0.0);
     
        }

        
        for(int i=0;i<rate.size();i++){
            fail[i]=rate.get(i);
        }

        Collections.sort(rate, ((o1, o2) ->Double.compare(o2, o1)));

     
        for(int i=0; i<rate.size(); i++){
                 for(int j=0; j<fail.length; j++){
                     if(rate.get(i) == fail[j]){
                         answer[i] = j+1;
                         fail[j] = -1;
                         break;
                    }
                }
        }

 
        return answer;
    }
    
}