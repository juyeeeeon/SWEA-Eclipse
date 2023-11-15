package d3;

import java.util.Scanner;

public class P10804_문자열의거울상 {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{	
			StringBuffer sb = new StringBuffer();
			String str = sc.next();
			for (int i = 0; i < str.length(); i++) {
				String s = str.substring(i,i+1);
				if (s.equals("b")) {
					sb.append("d");
				}
				if (s.equals("d")) {
					sb.append("b");
				}
				if (s.equals("p")) {
					sb.append("q");
				}
				if (s.equals("q")) {
					sb.append("p");
				}
			}
			
			System.out.println("#"+test_case+" "+sb.reverse());
		}
	}
}
