package boj2439For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 2439번 별찍기 - 2
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for (int i=1; i<=n; i++) {
			int blankCount = n - i;
			for (int x=1; x<=blankCount; x++) {
				bw.write(" ");
			}
			for (int x=1; x<=i; x++) {
				bw.write("*");
			}
		bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
