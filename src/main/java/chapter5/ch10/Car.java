package chapter5.ch10;

public abstract class Car {
  public abstract void drive();
  public abstract void stop();
  public abstract void fuel(); // 추상함수는 상속받으면 반드시 구현해야한다.

  public void washCar() {} // 훅 메소드는 상속 받으면 구현해도 되고 안해도된다. 그런즉 일부함수만 오버라이딩해서 구현하면 된다.
  // 구현해도되고 안해도되는 메서드를 훅 메서드라고 한다.

  public void startCar() {
    System.out.println("시동을 켭니다.");
  }

  public void turnOff() {
    System.out.println("시동을 끕니다.");
  }

  final public void run() { // 변하면 안되서 final로 설정함
    startCar();
    drive();
    stop();
    turnOff();
    fuel();
    washCar();
  }
}
