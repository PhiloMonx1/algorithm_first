//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행,
//같은 열의 값을 서로 더한 결과가 됩니다.
//2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
//
//		제한 조건
//		행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
public class Test10 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
//		int[][] answer = arr1;
		int[][] answer = new int[arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
				System.out.println(answer[i][j]);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Test10 test = new Test10();

		int[][] ar1 = {{1, 2}, {2, 3}};
		int[][] ar2 = {{3, 4}, {5, 6}};
		int[][] ar3 = {{1}, {2}};
		int[][] ar4 = {{3}, {4}};


		System.out.println(test.solution(ar1, ar2));
		System.out.println(test.solution(ar3, ar4));
	}
}