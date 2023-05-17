package chapter5.ch11;

import static java.awt.image.ImageObserver.ERROR;

public class CompleteCalc extends Calculator{
  @Override
  public int times(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public int divide(int num1, int num2) {
    if (num2 == 0) {
      return ERROR;
    } else {
      return num1 / num2;
    }
  }

  public void complete() {
    System.out.println("모두 구현했습니다.");
  }
}
