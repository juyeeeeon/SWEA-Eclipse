package d2;

import java.util.Scanner;

public class P1989_초심자의회문검사 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String input = sc.next();
			boolean isP = true;
			for (int i = 0; i < input.length()/2; i++) {
				if(input.charAt(i) != input.charAt(input.length()-i-1)) {
					isP = false;
					continue;
				}
			}
			
			if(isP) System.out.println("#"+test_case+" "+1);
			else System.out.println("#"+test_case+" "+0);
		}
	}
}
