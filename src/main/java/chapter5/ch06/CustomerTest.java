package chapter5.ch06;

import java.util.ArrayList;

// 다형성과 다형성을 사용하는 이유
// 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
// 같은 코드에서 여러 다른 실행 결과가 나옴
// 정보 은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
// 다형성을 잘 활용하면 유연하고 확장성 있고, 유지보수가 편리한 프로그램을 만들 수 있음

// 상속은 언제 사용할까?
// is - a 관계
// 일반적인 개념과 구체적인 개념과의 관계
// 상위 클래스: 하위 클래스 보다 일반적인 개념
// 하위 클래스: 상위 클래스 보다 구체적인 개념들이 더해짐
// 상속은 클래스간의 결합도가 높은 설계
// 상위 클래스의 수정이 많은 하위 클래스에 영향을 미칠 수 있음
// 계층구조가 복잡하거나 상속도가 높으면 좋지 않음
// 단점으로 클래스 폭발이 일어날 수 있음

// Has - a 관계
// 클래스가 다른 클래스를 포함하는 관계
// 코드 재사용의 가장 일반적인 방법
// student가 subject를 포함하는
// library를 구현할때 arraylist생성하여 사용
// 상속하지 않음

public class CustomerTest {
  public static void main(String[] args) {
    ArrayList<Customer> customerList = new ArrayList<Customer>();

    Customer customerLee = new Customer(10010, "이순신");
    Customer customerShin = new Customer(10020, "신사임당");
    Customer customerHong = new GoldCustomer(10020, "홍길동");
    Customer customerYul = new GoldCustomer(10020, "이율곡");
    Customer customerKim = new VIPCustomer(10020, "김유신", 12345);

    customerList.add(customerLee);
    customerList.add(customerShin);
    customerList.add(customerHong);
    customerList.add(customerYul);
    customerList.add(customerKim);

    System.out.println("---- 고객 정보 출력 -----");

    for (Customer customer: customerList) {
      System.out.println(customer.toString());
    }

    System.out.println("---- 할인율과 보너스 포인트 계산 -----");

    int price = 10000;
    for (Customer customer: customerList) {
      int cost = customer.calcPrice(price);
      System.out.println(customer.getCustomerName() + "님이" + cost + "원 지불하셨습니다.");
      System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonusPoint + "원 지불하셨습니다.");
    }
  }



}
