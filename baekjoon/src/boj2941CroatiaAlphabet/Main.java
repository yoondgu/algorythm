package boj2941CroatiaAlphabet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이렇게 복잡하게 하지 않고 그냥 크로아티아 알파벳을 모두 길이 1인 문자로 바꿔주고 전체 length를 구해도된다..
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		String[] croAls = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		// 원래 문자열의 길이에서 해당 알파벳이 없어진 문자열의 길이를 빼면, 해당 알파벳이 차지하는 문자열의 길이가 구해진다.
		// 		따라서 원래 문자열에서 크로아티아 문자열을 하나씩 빼면서 그 차이로 크로아티아 알파벳 문자열의 길이를 구하고,
		// 		해당 알파벳을 표현하는 문자열의 길이가 각 알파벳마다 다르므로 문자열 길이의 차이를 해당 알파벳을 표현하는 문자열의 길이로 나눠주면 그 알파벳의 개수가 구해진다.
		//	순차적으로 replaceAll 하면 nljj -> nj 같은 문제가 생긴다.
		
		// 크로아티아 알파벳의 개수의 총합
		int croTotal = 0;
		int stringCroTotal = 0;
		for (int i = 0; i < croAls.length; i++) {
			int stringCnt = 0;
			// dz=도 포함되므로 dz=를 없애고 계산
			if ("z=".equals(croAls[i])) {
				String newWord = word.replaceAll("dz=", "");
				stringCnt = newWord.length() - newWord.replaceAll("z=", "").length();
			} else {
				stringCnt = word.length() - word.replaceAll(croAls[i], "").length(); // 해당 크로아티아 알파벳을 표현하는 문자의 개수
			}
			stringCroTotal += stringCnt; // 크로아티아 알파벳을 표현하는 문자의 총 개수 계산
			croTotal += stringCnt/croAls[i].length(); // 해당 크로아티아 알파벳의 개수가 저장된다.
		}
		
		int numTotal = word.length() - stringCroTotal; // 전체 문자의 개수에서 크로아티아 알파벳을 표현하는 문자의 개수를 전부 빼고 남는 게 일반 알파벳의 개수이다.
		int total = croTotal + numTotal;
		
		System.out.println(total);
	}
}
