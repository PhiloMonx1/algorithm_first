//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
//numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록
//solution 함수를 완성해주세요.
//	제한사항
//    1 ≤ numbers의 길이 ≤ 9
//		0 ≤ numbers의 모든 원소 ≤ 9
//		numbers의 모든 원소는 서로 다릅니다.

import java.util.ArrayList;
import java.util.Arrays;

public class Test06 {
	public static int solution(int[] numbers) {
		int answer = 0;
		ArrayList<Integer> arCheck = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < arCheck.size(); j++) {
				if (arCheck.get(j) == numbers[i]) {
					arCheck.remove(j);
				}
			}
		}
		for (int u = 0; u < arCheck.size(); u++) {
			answer += arCheck.get(u);
		}
		return answer;
	}

	public static void main(String[] args) {
		int arTest1[] = {1, 2, 3, 4, 6, 7, 8, 0};
		int arTest2[] = {5, 8, 4, 0, 6, 7, 9};
		int arTest3[] = {2, 4, 6, 8, 0};
		int arTest4[] = {1, 3, 5, 7, 9};

		System.out.println(solution(arTest1));
		System.out.println(solution(arTest2));
		System.out.println(solution(arTest3));
		System.out.println(solution(arTest4));
	}
}


/*
 * 이중 포문을 돌려
 * ar파라미터의 값과 ar체크의 값이 같으면
 * 그 같은 값을 ar체크에서 빼준다
 * 결국 남아 있는 애들을 뽑아내서
 * 그 뽑아낸 애들끼리 더해준다.
 * 더해준 값을 answer에 넣는다.
 * */