package chapter3.ch04;

// 인스턴스
// class를 new키워드를 이용하여 생성한 상태

// 힙메모리
// 생성된 인스턴스는 동적 메모리(heap memory)에 할당됨
// c 나 c++은 개발자가 직접 메모리 해제를 해야하지만 java에서는 GC가 메모리를 수거함
// 하나의 클래스로 부터 여러개의 인스턴스가 생성되고 각각 다른 메모리 주소를 갖게됨

// 용어 정리
// 객체: 객체 지향 프로그램의 대상, 생성된 인스턴스
// 클래스: 객체를 프로그래밍 하기위해 코드로 정의해 놓은 상태
// 인스턴스: new 키워드를 사용하여 클래스를 메모리에 생성한 상태
// 멤버 변수: 클래스의 속성, 특성
// 메서드: 멤버 변수를 이용하여 클래스의 기능을 구현한 함수
// 참조 변수: 메모리에 생성된 인스턴스를 가리키는 변수
// 참조 값: 생성된 인스턴싀 메모리 주소 값 (= 해시코드값)

public class StudentTest {
  public static void main(String[] args) {
    Student studentLee = new Student(100, "Lee");
    studentLee.studentName = "Lee";
    studentLee.studentAddress = "Seoul";

    Student studentKim = new Student(101, "Kim",  "NewYork");
    studentKim.studentName = "KIM";

    studentLee.showStudentInfo();
    studentKim.showStudentInfo();

    System.out.println(studentLee); // chapter2.ch04.Student@2acf57e3 // @앞에는 클래스 이름을 나타내고 @이후에는 주소값을 나태낸다.
    System.out.println(studentKim); // chapter2.ch04.Student@506e6d5e
  }
}
