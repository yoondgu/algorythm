package boj1316GroupwordChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int count = 0;
		for (int i = 0; i < num; i++) {
			String word = br.readLine();

			// 입력받은 단어에 대하여 그룹단어 판정하기
			boolean isGroupWord = true;
			for (int j = 0; j < word.length(); j++) {
				// 입력받은 단어의 문자를 인덱스 순서대로 검사한다.
				String ch = String.valueOf(word.charAt(j));
				
				// 해당 문자의 개수를 구한다.
				int countChar = word.length() - word.replaceAll(ch, "").length();
				if (countChar == 1) {
					// 해당 문자의 개수가 1이면 검사할 필요가 없다.
					continue;
				}
				
				if (countChar != word.length()) {
					// 해당 문자의 개수와 단어 전체 문자 개수가 같으면 이 문자 뿐이라는 것이므로 검사할 필요가 없다.
					// 현재 이 알파벳을 처음 검사한다고 했을 때, 시작 인덱스 ~ 시작인덱스+개수 만큼 문자가 모두 일치하는지 검사한다.
					// (같은 문자는 다시 검사하지 않도록 한다)
					isGroupWord = checkGroupChar(word, j, countChar);
					if (!isGroupWord) {
						// 한번이라도 false가 나오면 그룹단어가 아닌 것으로 판정, 반복문을 탈출하고 다음 입력으로 넘어간다.
						break;
					}
				}
				
				// 연속 문자로 판정됐으면 뒤에 따라오는 같은 문자는 건너뛰도록 반복문의 j값을 변경한다.
				j += countChar -1; 
			}
			
			// 모든 문자를 검사해도 isGroupWord가 true이면 그룹단어이다.
			if (isGroupWord) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean checkGroupChar(String word, int beginIndex, int countChar) {
		
		for (int i = beginIndex; i < beginIndex+countChar; i++) {
			if (word.charAt(beginIndex) != word.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
