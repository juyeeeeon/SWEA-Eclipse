package d3;

import java.util.Scanner;

public class P2805_농작물수확하기 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int result = 0;
			for (int i = 0; i < N; i++) {
				String line = sc.next();
				
				int j = line.length()/2;
				if(i<=j) {
					String substr = line.substring(j-i,j+1+i);
					for (int k = 0; k < substr.length(); k++) {
						result += Integer.parseInt(substr.substring(k,k+1));
					}
				}else {
					String substr = line.substring(i-j, line.length()-(i-j));
					for (int k = 0; k < substr.length(); k++) {
						result += Integer.parseInt(substr.substring(k,k+1));
					}
				}
				
			}
			
			System.out.println("#"+test_case+" "+result);

		}
	}
}
