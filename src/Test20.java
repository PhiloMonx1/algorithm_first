

//수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
//완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
//
//		제한사항
//		마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//		completion의 길이는 participant의 길이보다 1 작습니다.
//		참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//		참가자 중에는 동명이인이 있을 수 있습니다.

import java.util.HashMap;

public class Test20 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		int cnt = 1;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < participant.length; i++) {
			if(!map.containsKey(participant[i])){//containsKey = 키를 확인해서 있으면 트루 리턴
				map.put(participant[i], 1);
			}else {
				map.put(participant[i], map.get(participant[i])+1);
			}
		}
		for (int i = 0; i < completion.length; i++){
			if(map.containsKey(completion[i])){
				map.put(completion[i], map.get(completion[i])-1);
			}
		}

		for (int i = 0; i < participant.length; i++){
			if(map.get(participant[i]) > 0){
				answer = participant[i];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Test20 test = new Test20();
		String[] ar1P = {"leo", "kiki", "eden"};
		String[] ar1C = {"eden", "kiki"};
		String[] ar2P = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] ar2C = {"josipa", "filipa", "marina", "nikola"};
		String[] ar3P = {"mislav", "stanko", "mislav", "ana"};
		String[] ar3C = {"stanko", "ana", "mislav"};


		System.out.println(test.solution(ar1P, ar1C));
		System.out.println(test.solution(ar2P, ar2C));
		System.out.println(test.solution(ar3P, ar3C));
	}
}


/**
 * 	public String solution(String[] participant, String[] completion) {
 * 		String answer = "";
 * 		for (int i = 0; i < participant.length; i++) {
 * 			for (int j = 0; j < completion.length; j++) {
 * 				if(participant[i].equals(completion[j])){
 * 					participant[i] = "";
 * 					completion[j] = "";
 *                }* 			}
 * 			answer += participant    ;
 * 		}
 *
 * 		return ans  r;
 * 	}
 */