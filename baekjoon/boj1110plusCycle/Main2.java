package boj1110plusCycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1110번 훨씬 간단하게 작성하기.
 * 별도 메소드는 중복이 많거나 계산이 복잡할 때만 쓰고, while문의 조건을 간단하게 적되 조건이 되면 탈출하는 것으로 쓰자.
 *
 */
public class Main2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		int count = 0;
        // calNum은 계산할 숫자 변수, 처음에는 입력으로부터 주어진 수부터 시작한다. 
		int calNum = number;
		
		while(true) {
			int x = calNum/10; // 주어진 수의 첫째자리의 수
			int y = calNum%10; // 주어진 수의 둘째자리의 수
			int z = x+y;	 // 주어진 수의 각 자리의 수를 합한 값
			calNum = y*10 + z%10; // 둘째자리의 수(무조건 <10이다.)를 왼쪽에, 각 자리수의 합의 가장 오른쪽 자리의 수를 오른쪽에 둔다.
			count++;
			if(calNum==number) {
				break;
            }
		}
		
		// 출력은 여러번 반복하거나 긴 문자열을 출력하지 않기 때문에 BufferedWriter 객체를 따로 생성하지 않았다.
		System.out.println(count);
		br.close();
	}

}
