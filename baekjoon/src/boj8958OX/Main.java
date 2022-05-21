package boj8958OX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 8958번 OX퀴즈
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] quiz = new String[n];
		int[] scores = new int[n];
		
		for (int i = 0; i < n; i++) {
			quiz[i] = br.readLine();
			
			int count = 0;
			int score = 0;
			for (int j = 0; j < quiz[i].length(); j++) {
				// 문자가 X이면 count를 0으로 초기화시키고 넘어간다.
				if ('X' == quiz[i].charAt(j)) {
					count = 0;
					continue;
				// 문자가 X가 아니면 O이다. O이면 count의 숫자를 증가시키고, 이번 회수에 증가한 값을 점수에 저장한다.
				} else {
					count++;
					score += count;
				}
			}
			scores[i] = score;
		}
		
		for (int score : scores) {
			System.out.println(score);
		}
	}
}
