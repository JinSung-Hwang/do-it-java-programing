package chapter7.ch02;

import chapter3.ch08.Subject;

import java.nio.channels.ShutdownChannelGroupException;


// equals() 메서드
// 두 인스턴스의 주소값을 비교하여 true/false를 반환함
// 재정의 하여 두 인스턴스가 논리적으로 동일함의 여부를 구현하여 많이 사용하는 편
// 인스턴스의 주소가 다르더라도 논리적으로 동일한 경우 true를 반환하도록 재정의 할 수 있음

public class EqualsTest {

  public static void main(String[] args) throws CloneNotSupportedException {
    Student Lee = new Student(100, "Lee");
    Student Lee2 = Lee;
    Student shun = new Student(100, "Lee");

    System.out.println(Lee.equals(Lee2));
    System.out.println(Lee == Lee2);

    System.out.println(Lee.equals(shun)); // equals를 오버라이딩을 하지 않을때는 논리적으로는 같은 값이지만 false가 반환된다.
    System.out.println(Lee == shun);

    String str1 = new String("test");
    String str2 = new String("test");

    System.out.println(str1.equals(str2)); // true
    System.out.println(str1 == str2); // false

    System.out.println(System.identityHashCode(Lee));
    System.out.println(System.identityHashCode(shun));


    System.out.println(Lee.hashCode()); // 해시코드
    System.out.println(shun.hashCode()); // 해시코드

    System.out.println(str1.hashCode() == str2.hashCode());

    // hashCode 메서드
    // 1. hashCode는 인스턴스의 저장 주소를 반환함(10진수로)
    // 2. 힙 메모리에 인스턴스가 저장되는 방식이 hash 방식
    // 3. hash: 정보를 저장, 검색하는 자료 구조
    //    자료의 특정 값(키 값)에 대한 저장 위치를 반환해주는 해시 함수를 사용

    // 두 인스턴스가 같다는 것은?
    //    두 인스턴스에 대한 equals()의 반환값이 true이고 동일한 hashCode() 값을 반환 한다는 뜻이다.
    // 논리적으로 동일함을 위해 equals()메서드를 재정의 하였다면 hashCode()메서드도 재정의 하여 동일한 hashCode값이 반환되도록 해야한다.

    // equals() 메서드를 재정의했다고 hashCode메소드를 재정의하는것이 잘 이해가지 않아서 좀더 내용을 찾아봤다.
    // 참조: https://velog.io/@mooh2jj/equals%EC%99%80-hashCode%EB%8A%94-%EC%96%B8%EC%A0%9C-%EC%82%AC%EC%9A%A9%ED%95%98%EB%8A%94%EA%B0%80

    // 동등성: 객체가 주소값이 다르더라도 내용(필드값)이 같으면 같다고 보는것 ex) equals()
    // 동일성: 객체가 주소값이 다르면 아무리 같은 내용이더라도 같지 않다고 보는것 ex) ==

    // object의 equals는 동일성으로 구현되어있지만 String이나 실무에서 만드는 객체들은 equals를 오버라이딩해서 동등성을 맞춰서 개발한다.
    // 근데 이게 Collection 객체를 사용할때는 내부적으로 hashCode와 equals를 이용해서 객체가 같은지 검사하는데
    // hashCode를 재정의하지 않으면 hashCode는 동일성으로 동작하고 equals는 동등성으로 동작한다.
    // 하여 Collection객체를 사용할때 잘못 동작하는 것을 막기 위해서 hashCode와 equals 모드 동등성으로 동작하기위해서 equals를 오버라이딩하면 hashCode도 오버라이딩하라는 이야기이다.


    // clone (deepCopy)
    Student Lees = (Student) Lee.clone(); // clone의 리턴은 object형태이기때문에 Student라고 다운캐스팅을 해줘야한다.
    System.out.println(Lees.toString());

  }
}
