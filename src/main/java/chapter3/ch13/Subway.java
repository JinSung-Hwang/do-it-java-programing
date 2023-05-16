package chapter3.ch13;

public class Subway {
  public int number;
  public int money;
  public int passengerCount;

  public Subway(int number) {
    this.number = number;
  }

  public void take(int money) {
    this.money += money;
    this.passengerCount++;
  }

  public void showBusInfo() {
    System.out.println(number + "번의 승객은 " + this.passengerCount + "명이고 수입은 " + money + "원 입니다.");
  }


}
