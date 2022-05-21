package boj3052Remainder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 3052번 나머지의 개수
 * 배열 대신 Set 사용해보기. HastSet은 중복을 허용하지 않는다.
 */
public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> hs = new HashSet<>();
		
		for (int i=0; i<10; i++) {
			hs.add(Integer.parseInt(br.readLine())%42);
		}
		
		System.out.println(hs.size());
	}
}
