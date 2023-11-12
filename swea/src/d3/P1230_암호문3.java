package d3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1230_암호문3 {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;

		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			ArrayList<Integer> pwd = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				pwd.add(Integer.parseInt(st.nextToken()));
			}
			
			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			int i=0;
			while(i<M) {
				String inst = st.nextToken();
				if(inst.equals("I")) {
					insert(pwd, st);
					i++;
				}
				else if(inst.equals("D")) {
					delete(pwd, st);
					i++;
				}
				else if(inst.equals("A")) {
					add(pwd, st);
					i++;
				}
					
			}
			bw.write("#"+test_case);
			for(int j=0; j<10; j++) {
				bw.write(" "+ pwd.get(j));
			}
			bw.write('\n');

		}
		bw.flush();
		br.close();
		
	}

	private static void add(ArrayList<Integer> pwd, StringTokenizer st) {
		int y = Integer.parseInt(st.nextToken());
		for (int i = 0; i < y; i++) {
			pwd.add(Integer.parseInt(st.nextToken()));
		}
		
	}

	private static void delete(ArrayList<Integer> pwd, StringTokenizer st) {
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<y; i++) {
			pwd.remove(x++);
		}
		
		
	}

	private static void insert(ArrayList<Integer> pwd, StringTokenizer st) {
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<y; i++) {
			pwd.add(x++, Integer.parseInt(st.nextToken()));
		}
		
	}
}
