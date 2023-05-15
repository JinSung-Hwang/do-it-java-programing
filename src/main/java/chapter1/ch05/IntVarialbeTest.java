package chapter1.ch05;


// 변수를 선언하면 해당되는 자료형의 크기 만큼 메모리가 할당
// 변수는 할당된 메모리를 가리키는 이름
// 변수를 선언한다는 것은 선언한 변수 이름으로 어떤 위치에 있는 메모리를 얼마만큼의 크기로 사용하겠다는 뜻

// 기본 자료형(primitive data type)의 종류

//   -    정수형, 문자형, 실수형, 논리형
// 1바이트 byte,    -,      -,    boolean
// 2바이트 short,  char,    -,      -
// 4바이트 int,     -,     float,   -
// 8바이트 long,    -,     double,  -


public class IntVarialbeTest {
  public static void main(String[] args) {
    byte bs = 127;
    System.out.println(bs);

    long iVal = 12345678900L; // 첩자L을 붙여줘야한다.
    System.out.println(iVal);
  }
}
