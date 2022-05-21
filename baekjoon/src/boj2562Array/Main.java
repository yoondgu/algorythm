package boj2562Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2562번 최댓값
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numbers = new int[9];
		int max = 0;
		int index = -1;
		for (int i=0; i<9; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			if (i==0 || numbers[i] > max) {	// if문 대신 Math.max 메소드를 사용해볼 수도 있다.
				max = numbers[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}
