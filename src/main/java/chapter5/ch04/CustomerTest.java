package chapter5.ch04;


// super 키워드
// 하위 클래스에서 가지는 상위 클래스에 대한 참조값
// super()는 상위 클래스의 기본 생성자를 호출함
// 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출됨
// (이때 반드시 상위 클래스의 기본 생성자가 존재해야함)
// 상위 클래스의 기본 생성자가 없는 경우 (다른 생성자가 있는 경우) 하위 클래스에서는 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출함
// super는 생성된 상위 클래스 인스턴스의 참조 값을 가지므로 super를 이용하여 상위 클래스의 메서드나 멤버 변수에 접근할 수 있음


class CustomerTest {
  public static void main(String[] args) {
    Customer customerLee = new Customer();
    customerLee.setCustomerName("이순신");
    customerLee.setCustomerId(10010);
    customerLee.bonusPoint = 1000;
    int price = 10000;
    int cost = customerLee.calcPrice(price);
    System.out.println(customerLee.toString() + "지금 금액은" + cost + "입니다.");

    VIPCustomer customerKim = new VIPCustomer();
    customerKim.setCustomerName("김유신");
    customerKim.setCustomerId(10020);
    customerKim.bonusPoint = 10000;
    cost = customerKim.calcPrice(price);
    System.out.println(customerKim.toString() + "지금 금액은" + cost + "입니다.");

    Customer customerPark = new VIPCustomer();
    customerPark.setCustomerName("park");
    cost = customerPark.calcPrice(price);
    System.out.println(customerPark.toString() + "지불 금액은" + cost + "입니다.");


  }
}