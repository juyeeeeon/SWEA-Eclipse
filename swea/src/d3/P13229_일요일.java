package d3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P13229_일요일 {
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		Map<String, Integer> week = new HashMap<>();
		week.put("MON", 1);
		week.put("TUE", 2);
		week.put("WED", 3);
		week.put("THU", 4);
		week.put("FRI", 5);
		week.put("SAT", 6);
		week.put("SUN", 7);
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int tmp = week.get(sc.next())-7;
			if (tmp == 0) {
				tmp = 7;
			}
			if (tmp < 0) {
				tmp = -tmp;
			}
			
			System.out.println("#"+test_case+" "+tmp);
		}
	}
}
