package d3;

import java.util.Scanner;

public class P16910_원안의점 {

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
		
			int N = sc.nextInt();
			int cnt = 0;
			
			for (int x = -200; x <= 200; x++) {
				for (int y = -200; y <= 200; y++) {
					if (x*x + y*y <= N*N) {
						cnt++;
					}
				}
			}
			
			System.out.println("#"+test_case+" "+cnt);
		}
	}
}
