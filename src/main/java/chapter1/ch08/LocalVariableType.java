package chapter1.ch08;

public class LocalVariableType {
  public static void main(String[] args) {
    var i = 10;
    var j = 10.0;
    var str = "hello"; // var 키워드를 통해서 자료형 선언 없이 지역 변수 선언이 가능하다.
    // 지역 변수는 컴파일할떄 데이터의 타입을 확인하고 타입 추론을 해준다.

    System.out.println(i);
    System.out.println(j);
    System.out.println(str);

    str = "Test";
    // str = 3; // javascript처럼 다른 데이터 타입의 데이터를 널을 순 없다.
    System.out.println(str);
  }
}
