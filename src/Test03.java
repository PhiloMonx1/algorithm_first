public class Test03 {
//    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//    s는 길이가 1 이상, 100이하인 스트링입니다.
    public String solution(String s) {
        String[] ar;
        int len = s.length();
        ar = s.split("");
        String answer = "";
        if(len%2 == 0){
            answer = ar[(len/2)-1] + ar[(len/2)];
        }else{
            answer = ar[(len/2)];
        }
        return answer;
    }

    public static void main(String[] args) {
        Test03 test = new Test03();
        System.out.println(test.solution("fdasfsadassd"));
    }
}



//    일단 스트링의 길이를 받는다.
//    스트링의 길이를 반으로 나눈다.
//    나머지가 0일 경우 짝수
//    나머지가 1일 경우 홀수이다
//
//
//    스트링을 하나씩 쪼갠다.
//    쪼갠걸 배열에 담는다.
//
//    만약 짝수일 경우
//    나눠진 값의 인덱스와 그 다음 인덱스까지 주면 됨
//
//    홀수일 경우
//    0.5 높인 값의 배열 인덱스의 친구 주면 됨

