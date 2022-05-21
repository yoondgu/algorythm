package boj8958Array;

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
		
		// quiz도 배열로 만들 필요 없다. for문 안에서 해결하므로
		String quiz = " ";
		int[] scores = new int[n];
		
		for (int i = 0; i < n; i++) {
			quiz = br.readLine();
			
			int count = 0;
			int score = 0;
			for (int j = 0; j < quiz.length(); j++) {
				// 문자가 X이면 count를 0으로 초기화시키고 넘어간다.
				if ('X' == quiz.charAt(j)) {
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
