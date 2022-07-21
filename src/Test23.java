//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
//예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//		제한 조건
//		n은 10,000,000,000이하인 자연수입니다.
public class Test23 {
	public int[] solution(long n) {
		int[] answer = {};
		String[] arr;
		arr = Long.toString(n).split("");
		int len = arr.length;
		answer = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			answer[len-1] = Integer.parseInt(arr[i]);
			len--;
		}
		return answer;
	}

	public static void main(String[] args) {
		Test23 test = new Test23();
		System.out.println(test.solution(12345));
	}
}
