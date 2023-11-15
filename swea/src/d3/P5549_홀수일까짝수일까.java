package d3;

import java.util.Scanner;

public class P5549_홀수일까짝수일까 {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String N = sc.next();
			if (N.charAt(N.length()-1)=='1' ||
					N.charAt(N.length()-1)=='3' ||
					N.charAt(N.length()-1)=='5' ||
					N.charAt(N.length()-1)=='7' ||
					N.charAt(N.length()-1)=='9' ) {
				System.out.println("#"+test_case+" "+"Odd");
			}
			else System.out.println("#"+test_case+" "+"Even");
		}
	}
}
