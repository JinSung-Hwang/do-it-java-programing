package chapter5.ch15;

import javax.swing.plaf.SliderUI;

public class CustomerTest {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.sell();
    customer.buy();
    customer.sayHello();

    Buy buyer = customer;
    buyer.buy();
    // customer가 여러 인터페이스를 구현했다고 하더라도 buy로 업캐스팅(buy의 함수만 노출시킴)을 하면 buy와 관련된 함수만 사용가능하다.

    Sell seller = customer;
    seller.sell();
    // customer가 여러 인터페이스를 구현했다고 하더라도 buy로 업캐스팅(buy의 함수만 노출시킴)을 하면 buy와 관련된 함수만 사용가능하다.

    customer.order();
  }
}
