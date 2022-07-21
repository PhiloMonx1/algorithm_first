//함수 solution은 정수 n을 매개변수로 입력받습니다.
//n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//예를들어 n이 118372면 873211을 리턴하면 됩니다.
//
//		제한 조건
//		n은 1이상 8000000000 이하인 자연수입니다.

import java.util.Arrays;
import java.util.Collections;

public class Test24 {
	public long solution(long n) {
		long answer = -4;
		String s = "";
		String[] arr;
		arr =  Long.toString(n).split("");
		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		answer = Long.parseLong(s);

		return answer;
	}

	public static void main(String[] args) {
		Test24 test = new Test24();
		System.out.println(test.solution(118372));
	}
}


/**
 * 1. 파라미터를 스트링으로 바꾼다
 * 2. 배열에 죄다 담는다
 * 3. 배열끼리 확인해서 가장 작은 수대로 다른 배열에 담는다 (이거 그냥 오름차 순 쓰면 어떻게 될까)
 * 4. 배열을 하나의 스트링으로 묶는다.
 * 5. 롱으로 형변환 한다.
 * -1. 배열 두개가 필요하다.
 */