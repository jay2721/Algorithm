import java.util.*;

public class No_9012 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			String msg = "YES";
			Stack<String> stack = new Stack<>();
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '(')
					stack.push("(");
				else if (s.charAt(j) == ')') {
					if (stack.isEmpty()) {
						msg = "NO";
						break;
					} else
						stack.pop();
				}
			}
			if (!stack.isEmpty())
				msg = "NO";
			
			System.out.println(msg);
		}

	}
}
