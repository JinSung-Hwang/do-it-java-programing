package chapter2.ch05;

public class MyListQueueTest {

  // Queue의 특징
  // 맨 앞(front)에서 자료를 꺼내거나 삭제하고, 맨 뒤(rear)에서 자료를 축가함
  // First In First out (선입선출 구조)
  // 일상 생활에서는 "줄서있는 모습", "콜센터"가 Queue의 모습과 같다.
  // 순차적으로 입력된 데이터를 순차적으로 처리하기 위한 자료 구조
  // jdk 클래스: ArrayList

  public static void main(String[] args) {
    MyListQueue listQueue = new MyListQueue();
    listQueue.enQueue("A");
    listQueue.enQueue("B");
    listQueue.enQueue("C");
    listQueue.enQueue("D");
    listQueue.enQueue("E");
    listQueue.printAll();

    System.out.println("================");

    System.out.println(listQueue.deQueue());
    System.out.println(listQueue.deQueue());
    System.out.println(listQueue.deQueue());
    System.out.println(listQueue.deQueue());
    System.out.println(listQueue.deQueue());

    listQueue.printAll();
  }

}
