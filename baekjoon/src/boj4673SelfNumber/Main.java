package boj4673SelfNumber;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static int calculate(int n) {
		int total = n;
		
		while (n != 0) {
			total += (n%10); // 일의 자리 수를 더한다.
			n /= 10; // 이미 더한 자리수의 숫자는 삭제한다. 예: 422 -> 42.2 -> 42
		}
		
		return total;
	}
	
	public static void main(String[] args) throws IOException {
		
		// 1 ~ 10000 까지의 수 중에 셀프넘버 여부를 체크한다. result가 10000보다 크면 저장하지 않는다.
		// boolean 값을 저장하는 배열에 각 인덱스의 숫자에 따른 생성자 존재 여부를 저장한다.
		// (boolean 타입의 배열은 기본 저장값이 false이다)
		// calculate(int n) 함수를 실행해서 얻은 값은 생성자가 존재하는 숫자이다.
		// 따라서 계산해서 나온 숫자 result를 인덱스로 하는 칸의 값을 true로 바꾼다.
		
		// i가 아니라 result 가 10000보다 작거나 같은 모든 셀프넘버인데, i가 1~10000이라고 그렇게 되는지? 일정하게 증가하는게 아닌데
		// 1부터 1씩 증가하며 calculate함수로 연산한 수들 중 각 가장 큰 자리의 수가 같은 수는 대소관계가 명확하다.
		boolean[] isSelfNumberList = new boolean[10001];
		for (int i = 1; i < 10001; i++) {
			int result = calculate(i);
			if (result > 10000) {
				continue; 
			}
			isSelfNumberList[result] = true;
		}
		
		// boolean 배열에서 false인 인덱스의 값만 출력한다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 1; i < isSelfNumberList.length; i++) {
			if (!isSelfNumberList[i]) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}
	
}
		
		
