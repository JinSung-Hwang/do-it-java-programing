package chapter1.ch07;

// 문자도 정수로 표현합니다.

// 어떤 문자를 컴퓨터 내부에서 표현하기 위해 특정 정수 값을 정의
// A는 65

// 문자 세트: 각 문자를 얼마로 표현할 것인지 코드값을 모아둔 것을 문자세트(character set)라 함 (룰북)

// 참고하세요
// character set: 문자를 숫자로 변환한 값의 세트 (룰북이라고 표현하자)

// encoding: 문자가 숫자로 변환되는 것
// decoding: 숫자에서 다시 문자로 변환되는 것

// askii code: 알파벳과 숫자 특수 문자등을 1바이트로 표현하는 캐릭터 셋
// unicode: 전 세계 표준으로 만든 문자 세트
// utf-8: 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있음
// utf-16: 2바이트로 문자를 표현

public class CharacterTest {
  public static void main(String[] args) {

    char ch1 = 'A';
    String ch = "A"; // "" 를 사용하면 문자열이 된다. 내부적으로는 A다음에 null이라는 캐릭터가 있다. 따라서 ch1과 다르고 ch는 char에 담을 수 없다.
    System.out.println(ch1);
    System.out.println((int)ch1);

    char ch2 = 66;
    System.out.println(ch2);
//    System.out.println((int)ch2);

    char ch3 = '한';
    char ch4 = '\uD55c';
    char ch5 = '\uAC00';
    System.out.println(ch3);
    System.out.println(ch4);
    System.out.println(ch5);

  }
}
