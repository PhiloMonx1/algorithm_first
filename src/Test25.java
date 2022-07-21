//임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//
//		제한 사항
//		n은 1이상, 50000000000000 이하인 양의 정수입니다.

public class Test25 {
	public long solution(long n) {
		long answer = 0;
			for (long i = 0; i <= n; i++) {
				if (i * i == n) {
					answer = (i + 1) * (i + 1);
					break;
				} else answer = -1;
			}
		return answer;
	}

	public static void main(String[] args) {
		Test25 test = new Test25();
		System.out.println(test.solution(1));
		System.out.println(test.solution(3));
		System.out.println(test.solution(121));
		System.out.println(test.solution(36));
		System.out.println(test.solution(38));
		System.out.println(test.solution(144));
	}
}


/**
 * 	public long solution(long n) {
 * 		long answer = 0;
 * 		Double d = 0.0+n;
 * 		String s ="";
 * 		d /= 2;
 * 		for(int i=0; i<5000; i++){
 * 			if(d > 0){
 * 				d -= i;
 *            }else {
 * 				d *= -2;
 * 				if(d*d == n){
 * 					d += 1;
 * 					s += (d*d);
 * 						answer = Long.parseLong(s.replace(".0", ""));
 * 						break;
 *          }else{
 * 						answer = -1;
 * 						break;
 *          }
 *        }
 *      }
 *
 * 		return answer;
 * 	}
 */