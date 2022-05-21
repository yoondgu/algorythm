package boj2577Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2577번 숫자의 개수
 * 아스키코드로 변환되지 않도록 해야하는 것, char->int 변환 주의하기.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int result = a*b*c;
		String str = Integer.toString(result);
		
		int[] numbers = new int[str.length()];
		for (int i=0; i<str.length(); i++) {
			numbers[i] = str.charAt(i) - '0'; // char->int 형변환
		}
		
		// numbers 배열의 값은 무조건 0~9 중 하나이고, counter 배열은 0~9번째 칸에 0~9까지의 수의 각 개수를 저장한다.
		// numbers[i]에 들어가는 값이 1이면 counter[1]의 값이 1 증가한다.
		int[] counter = new int[10];
		for (int i=0; i<numbers.length; i++) {
			counter[numbers[i]]++;
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(counter[i]);
		}
	}
}
