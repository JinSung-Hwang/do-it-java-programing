package chapter1.ch12;

public class ShortCircuitEvaluation {
  public static void main(String[] args) {
    int num1 = 10;
    int i = 2;

    boolean value;
    value = ( (num1 = num1 + 10) < 10) && ( (i = i+2) < 10);
    System.out.println(value);
    System.out.println(num1);
    System.out.println(i); // i값이 그대로 2이다. 왜냐하면 && 논리연산자는 앞에가 false이면 뒤에 구문을 Evaluation(평가)하지 않기 때문이다.

    value = ( (num1 = num1 + 10) < 10) || ( (i = i+2) < 10);
    System.out.println(value);
    System.out.println(num1);
    System.out.println(i); // i값이 4가 된다. ||연산자는 두군대 모두 평가하기 때문이다.


  }
}
