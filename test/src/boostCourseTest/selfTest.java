package boostCourseTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class selfTest {

	public static int[] solution(int[] arr) {

// map, set 활용해보려다 어려워서 그냥 list에 for문만 썼다..				
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			int checkNum = arr[i];
			
			// 다시 계산하지 않도록 대입해둔 0이 꺼내졌을 경우 다음 숫자로 넘어간다.
			if (checkNum == 0) {
				continue;
			}
			
			for (int j = i+1; j < arr.length; j++) {
				int num = arr[j];
				if (checkNum == num) {
					count++;
					arr[j] = 0; //다시 계산할 일 없도록 0을 대입한다.
				}
			}
			
			if (count > 1) {
				list.add(count);
			}
		}
		
		if (list.size() == 0) {

			int[] result = {-1};
			return result;
		} else {
			
			int[] result = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				result[i] = list.get(i).intValue();
			}
			return result;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrLength = sc.nextInt();
		int[] arr = new int[arrLength];
		
		for (int i = 0; i < arrLength; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		
		int[] result = solution(arr);
		
		for (int num : result) {
			System.out.println(num);
		}
	}
}
