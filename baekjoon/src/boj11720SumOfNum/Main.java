package boj11720SumOfNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			// char '1'의 값은 49이다. int로 형변환할 시에 '값'으로 계산하게 된다.
			sum += str.charAt(i) - 48;
		}
		
		System.out.println(sum);
	}
}
