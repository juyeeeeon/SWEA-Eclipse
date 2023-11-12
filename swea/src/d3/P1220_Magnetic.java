package d3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1220_Magnetic {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		int T = 10;
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++){
			br.readLine();
			boolean[] prevN = new boolean[100];
			
			
			int result = 0;
			for (int i = 0; i < 100; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j< 100; j++) {
					 int tmp = Integer.parseInt(st.nextToken());
					 if(tmp == 1) prevN [j]= true;
					 if(tmp == 2 && prevN[j] == true) {
						 result++;
						 prevN[j] = false;
					 }
					 
					 
				}
			}
			
			bw.write("#"+test_case+" "+result+'\n');
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
