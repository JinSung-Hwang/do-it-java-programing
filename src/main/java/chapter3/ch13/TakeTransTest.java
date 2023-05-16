package chapter3.ch13;

// 객체의 협력
// 객체 지향 프로그램에서는 객체간에 협력이 이루어짐
// 협력을 위해서는 필요한 메세지를 전송하고 이를 처리하는 기능이 구현되어야함
// 매개변수로 객체가 전달되는 경우가 발생

public class TakeTransTest {
  public static void main(String[] args) {
    Person personJ = new Person("James", 5000);
    Person personT = new Person("Toams", 10000);

    Bus bus100 = new Bus(100);
    Subway subwayGreen = new Subway(2);

    personJ.takeBus(bus100);
    personT.takeSubway(subwayGreen);

    personJ.showStudentInfo();
    personT.showStudentInfo();

    bus100.showBusInfo();
    subwayGreen.showBusInfo();
  }
}
