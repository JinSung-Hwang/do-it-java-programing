package chapter5.ch15;

public class Customer implements Buy, Sell{
  @Override
  public void buy() {
    System.out.println("Customer Buy");
  }

  @Override
  public void sell() {
    System.out.println("Customer Sell");
  }

  public void sayHello() {
    System.out.println("Customer Hello");
  }

  // buy와 sell 인터페이스에서 default method가 중복되는 경우에는 반드시 default method를 오버라이드해서 재정의해야한다.
  @Override
  public void order() {
    Buy.super.order();
  }
}
