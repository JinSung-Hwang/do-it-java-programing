package chapter5.ch03;


// super 키워드
// 하위 클래스에서 가지는 상위 클래스에 대한 참조값
// super()는 상위 클래스의 기본 생성자를 호출함
// 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출됨
// (이때 반드시 상위 클래스의 기본 생성자가 존재해야함)
// 상위 클래스의 기본 생성자가 없는 경우 (다른 생성자가 있는 경우) 하위 클래스에서는 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출함
// super는 생성된 상위 클래스 인스턴스의 참조 값을 가지므로 super를 이용하여 상위 클래스의 메서드나 멤버 변수에 접근할 수 있음

class CustomerTest {
  public static void main(String[] args) {
//    Customer customerLee = new Customer();
//    customerLee.setCustomerName("이순신");
//    customerLee.setCustomerId(10010);
//    customerLee.bonusPoint = 1000;
//    System.out.println(customerLee.toString());

    Customer customerKim = new VIPCustomer(10020, "김유신"); // 하위 클래스가 생성될때는 반드시 내부적으로 상위 클래스부터 생성되고 하위 클래스가 생성된다.
    // precompile 시점에 하위 클래스의 생성자에서 super()라는 메서드가 자동적으로 추가되면서 상위클래스의 생성자가 호출된다.
    // super()는 default constructor이기에 매개변수가 없는 생성자가 호출된다.

    // customerKim은 vipCustomer의 멤버 변수에는 접근하지 못하지만 customer의 멤버 변수에는 접근이 가능하다.
    // 업캐스팅하면 subclass에 멤버 변수에는 접근할 수 가 없다.

    VIPCustomer vipCustomer = new VIPCustomer(100, "aa");
    // vipCustomer는 vipCustomer와 Customer의 멤버 변수 모두 접근이 가능하다.

    System.out.println(customerKim.toString());
  }
}