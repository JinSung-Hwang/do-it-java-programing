package chapter3.ch14;

// 변수의 유효 범위와 메모리

// 변수의 유효 범위(scope)와 생성과 소멸(life cycle)은 각 변수의 종류마다 다름
// 지역 변수, 멤버 변수, 클래스 변수는 유효 범위와 life cycle, 사용하는 메모리도 다름

// 지역 변수
// 선언 위치: 블록 내부에서 선언
// 사용 범위: 블록 스코프 내에서 사용 가능
// 메모리 종류: 스택
// 생성과 소멸: 블록 스코프가 닫히면 사용 불가능

// 멤버 변수
// 선언 위치: 클래스 멤버 변수
// 사용 범위: 클래스 내부에서 사용가능하며 private가 아니면 참조 변수로 외부에서 사용 가능함
// 메모리 종류: 힙
// 생성과 소멸: 인스턴스가 생성될 때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸된다.

// static 변수
// 선언 위치: static 예약어를 사용하여 클래스 내부에 선언
// 사용 범위: 클래스 내부에서 사용하고 private가 아니면 클래스 이름으로 다른 클래스에서 사용 가능
// 메모리 종류: 데이터 영역 (스태틱 영역)
// 생성과 소멸: 프로그램이 처음 시작할때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 떄 소멸된다.

// static 변수는 공통으로 사용되는 변수가 필요한 경우 사용함
// static 변수는 프로그램이 메모리에 있는 동안 계속 그 열역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않음
// 클래스 내부의 여러 메소드에서 사용하는 변수는 멤버 변수로 사용하는 것이 좋음
// 멤버 변수가 너무 많으면 인스턴스 생성시 쓸데없는 메모리가 할당됨
// 상황에 적절하게 변수를 사용해야 함

// 스태틱 변수는 여러 메소드에서 호출되어 값 변경의 추적이 어려워서 쓰면 안되지만
// 오직 읽기 전용으로 값을 공유하는 용도는 사용해도 된다. ex) Math.PI


public class EmployeeTest {
  public static void main(String[] args) {

    Employee employeeLee = new Employee();
    employeeLee.setEmployeeName("이순신");

    Employee employeeKim = new Employee();
    employeeKim.setEmployeeName("김유신");

//    System.out.println(employeeKim.serialNumber);
//    System.out.println(employeeLee.serialNumber);

    System.out.println(employeeLee.getEmployeeId());
    System.out.println(employeeKim.getEmployeeId());

    System.out.println(Employee.getSerialNumber()); // 스태틱 메서드는 인스턴스가 아니라 객체를 직접 사용한다.
  }
}
