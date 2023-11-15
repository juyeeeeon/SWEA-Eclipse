package d3;

import java.util.Scanner;

public class P3456_직사각형길이찾기 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int result = 0;
			
			if (a==b && b==c) result = a;
			if (a==b && b!=c) result = c;
			if (a==c && b!=c) result = b;
			if (c==b && b!=a) result = a;
			
		
			System.out.println("#"+test_case+" "+result);
			
			
		}
	}
}
