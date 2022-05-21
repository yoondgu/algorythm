package boj10951For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10951번 A+B - 4
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// Scanner를 쓰면 더 간단하지만 속도가 빠른 BufferedReader를 사용해보고자 했다.
		// 테스트케이스의 개수가 주어지지 않을 때 어떻게 반복하고 끝내야 하는지?
		// 		BufferedReader는 파일의 끝을 만나면 null을 리턴한다.
		// 오류처리는 하지 않음.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		while ((str = br.readLine())!=null) {
			String[] numbers = str.split(" ");
			System.out.println(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
		}
		br.close();
	}
}
