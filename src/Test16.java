import java.util.ArrayList;

//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
//다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
//단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
//
//		제한사항
//		문자열 s의 길이 : 50 이하의 자연수
//		문자열 s는 알파벳으로만 이루어져 있습니다.
public class Test16 {
	boolean solution(String s) {
		boolean answer = false;
		String[] ar;
		ar = s.split("");
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		for (int i=0; i<ar.length; i++){
			if(ar[i].equals("p")  || ar[i].equals("P")){
				list1.add(ar[i]);
			}else if(ar[i].equals("y") || ar[i].equals("Y")){
				list2.add(ar[i]);
			}
		}

		if(list1.size() == list2.size()){
			answer = true;
			return answer;
		}else return answer;
	}

	public static void main(String[] args) {
		Test16 test = new Test16();
		System.out.println(test.solution("pPoooyY"));
		System.out.println(test.solution("Pyy"));
	}
}
