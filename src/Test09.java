//프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
//전화번호가 문자열 phone_number로 주어졌을 때,
//전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수,
//solution을 완성해주세요.
//
//		제한 조건
//		phone_number는 길이 4 이상, 20이하인 문자열입니다.
public class Test09 {
	public String solution(String phone_number) {
		String answer = "";
		String[] ar;
		ar = phone_number.split("");
		for (int i=0; i<ar.length-4; i++){
			ar[i] = "*";
		}
		for (int i=0; i<ar.length; i++){
			answer += ar[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		Test09 test = new Test09();
		System.out.println(test.solution("01022057306"));
	}
}

/**
1. 번호를 배열로 담는다.
2. 배열의 길이를 구한다.
3. 배열의 길이로부터 -4를 제외하고
4. 포문으로 *을 넣어 answer에 더한다
5. 남은 배열에 있는 애들도 더해준다.
*/