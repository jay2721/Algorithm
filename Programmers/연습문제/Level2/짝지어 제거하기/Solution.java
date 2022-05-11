import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        Stack<String> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty())
                stack.push(String.valueOf(s.charAt(i)));
            else{
                String last=stack.peek();
                String now=String.valueOf(s.charAt(i));
                if(!last.equals(now))
                    stack.push(now);
                else
                   stack.pop();
            }
        }
        
        if(stack.size()!=0)
            answer=0;
        else 
            answer=1;
            

        return answer;
    }
}