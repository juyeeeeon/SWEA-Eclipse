package d3;

import java.util.Scanner;

public class P8741_두문자어 {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str1 = sc.next().toUpperCase();
			String str2 = sc.next().toUpperCase();
			String str3 = sc.next().toUpperCase();
			
			System.out.println("#"+test_case+" "+str1.charAt(0)+str2.charAt(0)+str3.charAt(0));
			
		}
	}
}
