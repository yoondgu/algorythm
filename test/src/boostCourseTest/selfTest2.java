package boostCourseTest;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class selfTest2 {

	public static int[] solution(int[] arr) {
		//map객체에 숫자, 개수를 담는다.
		//map객체에 대하여 2 이상인 값만 int[] 배열에 담는다.
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for (int num : arr) {
			if (map.get(num) == null) {
				map.put(num, 1);
			} else {
				int count = map.get(num);
				map.put(num, count+1);
			}
		}
		
		// 순서를 보장하는 map객체(linkedHashMap, TreeMap)의 keySet(), values(), entrySet()의 반환값 또한 순서를 보장한다.
		
		// 2개 이상이 아닌 값은 삭제한다. 삭제 작업을 위해서는 iterator 객체를 사용한다.
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			int key = iterator.next();
			int value = map.get(key);
			
			if (value < 2) {
				iterator.remove();
			}
		}
		
		if (map.size() == 0) {
			int[] result = {-1};
			return result;
		}
		
		int[] result = new int[keySet.size()];
		int i = 0;
		for (Integer key : keySet) {
			result[i] = map.get(key);
			i++;
		}
		
		return result;
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
