package boj1065ArithmeticSequenceNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static boolean checkNumber(int number) {		
		// 두 개 이상의 수의 차이를 구하기 전에, 한자리의 수는 무조건 한수이다. (0, n 두 개)
		if (number < 10) {
			return true;
		}
		
		// 두 개 이상의 자리를 가진 수의 한수 여부를 체크한다.
		// 각 자리수를 순서대로 리스트에 담는다.
		List<Integer> splitedNums = new ArrayList<>();
		while (number != 0) {
			splitedNums.add(number%10);
			number /= 10;
		};
		
		// 앞 뒤 수의 차이가 계속해서 같으면 true를 반환, 한번이라도 다르면 false를 반환한다.
		int minus = splitedNums.get(0) - splitedNums.get(1);
		for (int i = 2; i < splitedNums.size(); i++) {
			if (minus != splitedNums.get(i-1) - splitedNums.get(i)) {
				return false;
			}
			minus = splitedNums.get(i-1) - splitedNums.get(i);
		}
		return true;
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
