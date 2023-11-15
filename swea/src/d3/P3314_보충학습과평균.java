package d3;

import java.util.Scanner;

public class P3314_보충학습과평균 {

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int summation = 0;
			for (int i = 0; i < 5; i++) {
				int tmp = sc.nextInt();
				if(tmp <40) tmp = 40;
				summation += tmp;
			}
			System.out.println("#"+test_case+" "+summation/5);
		}
	}
}
