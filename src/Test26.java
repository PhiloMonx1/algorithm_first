//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단,
//리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
//예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//
//		제한 조건
//		arr은 길이 1 이상인 배열입니다.
//		인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

import java.util.ArrayList;

public class Test26 {
	public int[] solution(int[] arr) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int stand = arr[0];
		if (arr.length > 1){
			answer = new int[arr.length-1];
			for (int i = 0; i < arr.length; i++) {
				if (stand > arr[i]){
					stand = arr[i];
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] != stand){
					list.add(arr[i]);
				}
			}
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}else {
			answer = new int[arr.length];
			answer[0] = -1;
		}

		return answer;
	}

	public static void main(String[] args) {
		Test26 test = new Test26();
		int[] ar1 = {4,3,2,1};
		int[] ar2 = {10};
		int[] ar3 = {10,1,9,4,5,8,3,2};
		System.out.println(test.solution(ar1));
		System.out.println(test.solution(ar2));
		System.out.println(test.solution(ar3));
	}
}

/**
 * 1. 어레이리스트를 만든다. (파라 배열과 일치하는 것)
 * 2. 가장 작은 수를 찾는다. (이프문으로 찾는 방법)
 *    1) 리스트[0] 값을 기준변수로 지정
 *    2) 포문으로 기준변수 값과 [i] 값 중 더 작은거 비교
 *    3) 작은 수가 발견되면 기준변수를 그 수로 바꿔준다.
 *    4) 가장 작은 수가 기준변수에 담긴다.
 *
 * 3. 가장 작은 수를 포문으로 어레이리스트에서 삭제한다
 * 4. 어레이리스트를 앤써에 하나씩 넣는다.
 *
 *
 */

/**
 * 		int[] answer = {};
 * 		if(arr.length> 1){
 * 			answer = new int[arr.length-1];
 *
 *        }else {
 * 			answer = new int[arr.length];
 * 			answer[0] = -1;
 *    }
 * 		return answer;* 	}
 */
/**
 * 	public int[] solution(int[] arr) {
 * 		int[] answer = {};
 * 		int stand = arr[0];
 * 		if(arr.length > 1){
 * 			answer = new int[arr.length-1];
 * 			for (int i = 0; i < arr.length; i++) {
 * 				if(stand <= arr[i]){
 * 					answer[i] = arr[i];
 * 					stand = arr[i];
 *                }*          }
 * 		}else {
 * 			answer = new int[arr.length];
 * 			answer[0     -1;
 * 		}
 *
 * 		for (int i = 0; i < answer.length; i++) {
 * 			System.out.println(answ    i]);
 * 		}
 *
 * 		return   swer;
 * 	}
 */