package boj1110plusCycle;

import java.util.Scanner;

/**
 * baekjoon 1101번 더하기사이클
 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
 * 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
 * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
 * 출력: 첫째 줄에 N의 사이클 길이를 출력한다.
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
