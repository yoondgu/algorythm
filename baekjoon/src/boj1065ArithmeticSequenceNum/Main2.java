package boj1065ArithmeticSequenceNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static boolean checkNumber(int number) {		
		// 두 개 이상의 수의 차이를 구하기 전에, 한자리의 수는 무조건 한수이다. (0, n 의 차이는 항상 -n)
		// 마찬가지로 두자리의 수 또한 무조건 한수이다. (n, m 의 차이는 항상 n-m)
		if (number < 100) {
			return true;
			
			// 1000보다 작은 수에 대하여 체크하는 것이므로 간단한 연산으로 확인할 수 있다.
		} else if (number < 1000) {
			int a = number / 100;
			int b = (number/10) % 10;
			int c = number % 10;
			
			return (a-b == b-c);
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int initialNum = Integer.parseInt(str);
		
		int count = 0;
		for (int i = 1; i < initialNum+1; i++) {
			if (checkNumber(i)) {
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
