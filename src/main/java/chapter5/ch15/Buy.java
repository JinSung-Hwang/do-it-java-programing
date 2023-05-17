package chapter5.ch15;

public interface Buy {
  void buy();

  default void order() {
    System.out.println("buyer order");
  }
}
