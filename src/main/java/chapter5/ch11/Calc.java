package chapter5.ch11;

public interface Calc {
  // 인터페이스에 선언된 변수는 모두 public static final이라는 키워드를 가진다.
  double PI = 3.14;

  // 밑에 4개의 함수에는 public abstract라는 키워드가 안붙는데
  // precomfile단계에서 자동적으로 public abstract라는 키워드가 붙는다.
  // 즉, 모두 추상 메소드로 선언 된다.
  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);
}
