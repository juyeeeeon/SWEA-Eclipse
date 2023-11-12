package d3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class P8658_Summation {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			ArrayList<Integer> result = new ArrayList<Integer>();

			for(int j=0; j<10; j++) {
				String str = sc.next();
				int sum = 0;
				for(int i=0; i<str.length(); i++) {
					sum+=Integer.parseInt(str.substring(i, i+1));
				}
				result.add(sum);
			}
			
			
			System.out.println("#"+test_case+" "+Collections.max(result)+" "+Collections.min(result));
		}
	}
}
