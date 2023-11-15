package d3;

import java.util.Scanner;

public class P1213_String {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sc.nextInt();
			String findStr = sc.next().toLowerCase();
			String from = sc.next().toLowerCase();
			int result = 0;
			for (int i = 0; i <= from.length()-findStr.length(); i++) {
				if (from.substring(i, i+findStr.length()).equals(findStr)) result++;
			}
			
			System.out.println("#"+test_case+" "+result);
		}
	}
}
