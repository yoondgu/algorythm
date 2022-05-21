package boj3052Remainder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3052번 나머지의 개수
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numbers = new int[10];
		int[] counter = new int[42];
		// numbers 배열의 값은 무조건 0~41 중 하나이고, counter 배열은 0~41번째 칸에 0~41까지의 수의 각 개수를 저장한다.
		// numbers[i]에 들어가는 값이 1이면 counter[1]의 값이 1 증가한다.
		for (int i=0; i<10; i++) {
			numbers[i] = Integer.parseInt(br.readLine())%42;
			counter[numbers[i]]++;
		}
		
		// counter[] 배열에서 0이 아닌 값의 개수를 알아낸다.
		int count = 0;
		for (int i=0; i<42; i++) {
			if (counter[i] > 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
