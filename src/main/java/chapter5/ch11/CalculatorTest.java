package chapter5.ch11;

import chapter5.ch08.Computer;

public class CalculatorTest {
  public static void main(String[] args) {
    CompleteCalc calc = new CompleteCalc();
    calc.complete();

    int num1 = 10;
    int num2 = 2;
    System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
    System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1, num2));
    System.out.println(num1 + "*" + num2 + "=" + calc.times(num1, num2));
    System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2));
  }
}
