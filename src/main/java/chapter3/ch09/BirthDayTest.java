package chapter3.ch09;


// 캡슐화 -  정보 은닉을 활용한 캡슐화

// 꼭 필요한 정보와 기능만 외부에 오픈함
// 정보를 클래스화 해서 멤버 변수와 메서드를 감추고(private) 외부에 통합된 인터페이스만을 제공하여 일관된 기능을 구현 하게함
// 각각의 메서드나 멤버 변수를 접근함으로써 발생하는 오류를 최소환 한다.

public class BirthDayTest {

  public static void main(String[] agrs) {
    BirthDay day = new BirthDay();
    day.setYear(2023);
    day.setMonth(15);
    day.setDay(30);

    System.out.println(day.isValid());
  }

}
