//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//제한사항
//		arr은 자연수를 담은 배열입니다.
//		정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//		divisor는 자연수입니다.
//		array는 길이 1 이상인 배열입니다.

import java.util.Arrays;

public class Test14 {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int cnt =0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0){
				cnt++;
			}
		}
		answer = new int[cnt];
		if(cnt > 0){
			for (int i =0; i < arr.length; i++){
				if(arr[i] % divisor == 0) {
					answer[cnt-1] = arr[i];
					cnt--;
				}
			}
		}else {
			answer = new int[1];
			answer[0] = -1;
		}

		Arrays.sort(answer);
		for (int i=0; i<answer.length; i++){
			System.out.println(answer[i]);
		}
		return answer;
	}

	public int sum(int x, int y){
		return x + y;
	}

	public static void main(String[] args) {
		Test14 test = new Test14();

		int[] ar1 = {5, 9, 7, 10};
		int[] ar2 = {2, 36, 1, 3};
		int[] ar3 = {3, 2, 6};

		System.out.println(test.solution(ar1, 5));
		System.out.println(test.solution(ar2, 1));
		System.out.println(test.solution(ar3, 10));
	}
}
