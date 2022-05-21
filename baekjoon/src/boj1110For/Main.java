package boj1110For;

import java.util.Scanner;

/**
 * baekjoon 1101번 더하기사이클
 *
 */
public class Main {

	public static int calculate(int number) {
		/*
		 * 55
		 * 5 + 5 = 10
		 * 50
		 * 5 + 0 = 5
		 * 05
		 * 0 + 5 = 5
		 * 55
		 * 
		 * 너무 길게 풀었다. 다시 보기
		 */
		
		// 주어진 수의 각 자리의 수를 구한다. 주어진 수가 10보다 작은 경우 a는 0이다.
		int a = number/10; // int로 자동형변환, 소수점 자리수 버려진다.
		int b = number%10;
		
		 // 주어진 수(0~99)의 가장 오른쪽 자리의 수를 왼쪽에 둔다. (정수로 더하기 때문에 10을 곱함)
		int firstNumber = (number%10)*10;
		// 각 자리의 숫자를 합한 값(a+b)의 가장 오른쪽 자리의 수를 오른쪽에 둔다.
		int secondNumber = (a+b)%10;
		
		return firstNumber + secondNumber;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int startNum = number;
		int count = 1; // while문의 조건식에서 처음 실행될 때가 1번째이다.
		
		// 계산된 값이 처음 주어진 수와 같을 때까지 계산을 반복한다.
		while (calculate(number) != startNum) { // 조건식 안에 쓰는 거 다시 공부하기
			number = calculate(number);
			count ++;
		}
		
		System.out.println(count);
		sc.close();
		
	}
	
}
