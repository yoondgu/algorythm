package boj10818MinAndMax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 10818번 최소, 최대
 */
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] numStrings = br.readLine().split(" ");
		
		int min = 1_000_001;
		int max = -1_000_001;

		for (String numStr : numStrings) {
			int num = Integer.parseInt(numStr);
			if (min > num) {
				min = num;
			}
			if (max < num) {
				max = num;
			}
		}
		
		System.out.println(min+" "+max);
	}
}
