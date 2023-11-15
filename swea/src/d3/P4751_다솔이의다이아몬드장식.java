package d3;

import java.util.Scanner;

public class P4751_다솔이의다이아몬드장식 {

	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str = sc.next();
			String[] arr = new String[str.length()];
			if(str.length() == 1) formatting1(str);
			else {
				for (int i = 0; i < str.length(); i++) {
					arr[i] = str.substring(i,i+1);
				}
				formatting2(arr);
			}
		}
	}

	private static void formatting1(String substring) {
		System.out.println("..#..");
		System.out.println(".#.#.");
		System.out.println("#."+substring+".#");
		System.out.println(".#.#.");
		System.out.println("..#..");
	}
	
	private static void formatting2(String[] arr) {
		int len = arr.length;
		System.out.println(repeat("..#.",len)+".");
		System.out.println(repeat(".#.#",len)+".");
		for (String str : arr) {
			System.out.print("#."+str+".");
		}
		System.out.println("#");
		
		System.out.println(repeat(".#.#",len)+".");
		System.out.println(repeat("..#.",len)+".");
	}
	
	private static StringBuffer repeat(String str, int n) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<n; i++) {
			sb.append(str);
		}
		return sb;
	}
}
