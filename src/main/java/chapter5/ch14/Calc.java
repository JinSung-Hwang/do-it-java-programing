package chapter5.ch14;

public interface Calc {
  // 인터페이스에 선언된 변수는 모두 public static final이라는 키워드를 가진다.
  double PI = 3.14;
  int ERROR = -9999999;

  // 밑에 4개의 함수에는 public abstract라는 키워드가 안붙는데
  // precomfile단계에서 자동적으로 public abstract라는 키워드가 붙는다.
  // 즉, 모두 추상 메소드로 선언 된다.
  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);

  // default method
  default void description() { // 인터페이스이지만 default키워드를 통해서 메서드를 구현할 수 있음
    this.myMethod();
    System.out.println("정수를 계산합니다.");
  }

  private void myMethod() { // 이 private메소드를 오버라이드 할수없지만 interface 내부에서 메소드를 모듈화 할떄 사용한다.
    System.out.println("private method");
  }

  static int total(int[] arr) {
//    myMethod();  // 여기서는 private method를 호출할수 없다. static은 static이 붙여져야한다.
    mystaticMethod();
    int total = 0;
    for (int i : arr) {
      total += i;
    }
    return total;
  }
  private static void mystaticMethod() {
    System.out.println("private static method");
  }


}
