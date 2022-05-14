package boj10951AplusB4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력: 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 각 테스트 케이스마다 A+B를 출력한다.
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
