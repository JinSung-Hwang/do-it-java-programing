package chapter1.ch14;

public class BitTest {
  public static void main(String[] args) {
    int num1 = 5; // 00000101;
    int num2 = 10; // 00001010;

    System.out.println(num1 | num2);
    System.out.println(num1 & num2);
    System.out.println(num1 ^ num2);

    System.out.println(num1 << 2);
    System.out.println(num1);
    System.out.println(num1 <<= 2); // <<= 연산자를 해야 실제 값이 바뀐다. "<<" + "="
    System.out.println(num1);
  }
}
