package d3;

import java.util.Scanner;

public class P5431_민석이의과제체크하기 {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[] submit = new int[N+1];
			for (int i = 0; i < K; i++) {
				submit[sc.nextInt()]++;
			}
			
			System.out.print("#"+test_case);
			for (int i = 1; i < submit.length; i++) {
				if (submit[i] == 0) {
					System.out.print(" " + i);
				}
			}
			System.out.println();
		}
	}
}
