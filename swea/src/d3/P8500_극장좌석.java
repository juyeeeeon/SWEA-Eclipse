package d3;

import java.util.Arrays;
import java.util.Scanner;

public class P8500_극장좌석 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int result = N;
			for (int i : arr) {
				result += i;
			}
			
			result += arr[arr.length-1];
			System.out.println("#"+test_case+" "+result);
		}
	}
}
