package d3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P6958_동철이의프로그래밍대회 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			Integer[] cnt = new Integer[N];
			for (int i = 0; i < cnt.length; i++) {
				cnt[i]=0;
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					int tmp = sc.nextInt();
					if(tmp == 1)  cnt[i]++;
				}
			}
			
			Integer max = Collections.max(Arrays.asList(cnt));
			int winnerCnt = 0;
			for (Integer integer : cnt) {
				if (integer == max) {
					winnerCnt++;
				}
			}
			System.out.println("#"+test_case+" "+winnerCnt+" " +max);
		}
	}
}
