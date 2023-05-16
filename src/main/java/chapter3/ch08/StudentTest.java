package chapter3.ch08;


// 접근 제어자
// 클래스 메서드 멤버변수 앞에 접근제어자를 명시할 수 있음

// default(접근 제어자를 안썻을때 그냥 생김): 같은 패키지 않에서는 접근이 가능함
// public: 언제든지 외부 클래스에서 접근이 가능하다.
// protect: 같은 패키지나 상속 관계의 클래스에서 접근이 가능하다.
// private: 같은 클래스 내부에서만 접근 가능하다.



public class StudentTest {
  public static void main(String[] args) {
    Student studentLee = new Student(100, "Lee");
    Student studentKim = new Student(100, "Kim");

    studentLee.setKoreanSubject("국어", 100);
    studentLee.setMathSubject("수학", 95);

    studentKim.setKoreanSubject("국어", 80);
    studentKim.setMathSubject("수학", 99);

    studentLee.showStudentScore();
    studentKim.showStudentScore();
  }
}
