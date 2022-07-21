//문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
//각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
//
//		제한 사항
//		문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
//		첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
public class Test21 {
	public String solution(String s) {
		String answer = "";
		String[] arS = s.split("");
		int cnt = 0;

		for (int i = 0; i < arS.length; i++) {
			if(!(arS[i].equals(" ") || arS[i].equals(""))){
				if(cnt%2 == 0){
					arS[i] = arS[i].toUpperCase();
					cnt++;
				}else {
					arS[i] = arS[i].toLowerCase();
					cnt++;
				}
			}else cnt=0;

			answer += arS[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		Test21 test = new Test21();
		System.out.println(test.solution("try hello world"));
		System.out.println(test.solution("try   hello    world   sparta     "));
		System.out.println(test.solution("what  your name"));
		System.out.println(test.solution("welcome to sparta"));
	}
}
/**
 * 1. 스플릿을 스페이스 기준으로 나눈다.
 * 2. 단어를 다시 스플릿으로 배열을 나눈다 (배열이 몇개가 필요한데?)
 * 3. 배열마다 홀짝 대소를 해준다
 * 4. 배열을 스트링에 연결시킨다 배열 하나를 연결시킬 때 " "를 해준다,
 * 5. 마지막 배열을 연결할 때는 " "를 생략한다.
 *
 * !1. 배열에 담지않고 스트링의 일부분을 바꾸는 방법을 찾아보자 (s.charAt(i))
 * !2. 포문을 쓸 때 마지막 구호 생략을 찾아보자!
 */


/**
 * 		String answer = "";
 * 		String[] array;
 * 		array = s.split("");
 *
 * 		for (int i = 0; i < array.length; i++) {
 * 			if(!(array[i].equals(" "))){
 * 				if(i%2 ==0){
 * 					answer += array[i].toUpperCase();
 *                }else {
 * 					answer += array[i];
 *        }* 			}else answer += array    ;
 * 		}
 * 		return ans  r;
 * 	}
 */

/**
 * 		String answer = "";
 * 		String[] array;
 * 		array = s.split(" ");
 *
 * 		for (int i = 0; i < array.length; i++) {
 * //			System.out.println(array[i]);
 * 			for (int j = 0; j<array[i].length(); j++){
 * 				String cha = ""+array[i].charAt(j);
 * 				if(j%2 == 0){
 * 					answer += cha.toUpperCase();
 *                }else {
 * 					answer += cha.toLowerCase();
 *        }* 			}
 * 			if(i < array.length-1){
 * //				if(array[i] != "" && array[i] != " "){
 * 					answer += " ";
 * //				}
 *          }
 * 		}
 *
 * 		return   swer;
 * 	}
 */