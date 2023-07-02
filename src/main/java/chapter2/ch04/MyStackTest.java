package chapter2.ch04;

public class MyStackTest {

  // 스택
  // 맨 마지막 위치(top)에서만 자료를 추가, 삭제, 꺼내올 수 있음
  // Last In First Out(후입선출) 구조
  // 택배 상자가 쌓여있는 모양
  // 인터넷 브라우저의 뒤로가기, 스택트레이스, 콜스택, 게임에서 히스토리를 유지하고 이를 무를때 사용할 수 있음
  // 함수의 메모리는 호출 순서에 따란 stack 구조
  // jdk 클래스: stack

  public static void main(String[] args) {

    MyArrayStack stack = new MyArrayStack();

    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);


    stack.printAll();

    System.out.println("top element is " + stack.pop());
    stack.printAll();
    System.out.println("stack size is " + stack.getSize());

  }

}
