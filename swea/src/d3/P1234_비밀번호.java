package d3;

import java.util.Scanner;
import java.util.Stack;

public class P1234_비밀번호 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			String nums = sc.next();
			
			Stack<Character> stk = new Stack<>();
			stk.push(nums.charAt(0));
			for (int i = 1; i < N; i++) {
				if (!stk.isEmpty() && nums.charAt(i) == stk.peek()) {
					stk.pop();
				}else stk.push(nums.charAt(i));
			}
			
			System.out.print("#"+test_case+" ");
			
			while(!stk.isEmpty()) System.out.print(stk.remove(0));
			System.out.println();
		}
	}
	
}
