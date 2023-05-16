package chapter3.ch04;

public class Student {
  int studentId;
  String studentName;
  String studentAddress;

//  public Student() { } // 클래스 선언할때 생성자를 정의하지않으면 컴파일러가 자동적으로 default 생성자를 생성해준다.

  public Student() {} // 생성자 오버로딩, 이 생성자는 값은 초기화하지 않지만 객체를 생성하고 싶을떄 이렇게 생성한다.

  public Student(int id, String name) {
    this.studentId = id;
    studentName = name;
  }

  public Student(int id, String name, String address) {
    this.studentId = id;
    studentName = name;
    studentAddress = address;
  }

  public void showStudentInfo() {
    System.out.println(studentId + "," + studentName + "," + studentAddress);
  }

  public String getStudentName() {
    return studentName;
  }
}
