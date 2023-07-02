package chapter2.ch04;

import chapter2.ch02.MyArray;

public class MyArrayStack {

  int top;
  MyArray arrayStack;

  public MyArrayStack() {
    top = 0;
    arrayStack = new MyArray();
  }

  public MyArrayStack(int size) {
    top = 0;
    arrayStack = new MyArray(size);
  }

  public void push(int data) {
    if (isFull()) {
      System.out.println("스택이 모두 찼습니다.");
    } else {
      arrayStack.addElement(data);
      top++;
    }
  }

  public Boolean isFull() {
    if (top == arrayStack.ARRAY_CAPACITY) {
      return true;
    }
    return false;
  }

  public int pop() {
    if(top ==0) {
      System.out.println("스택이 비어있습니다.");
      return MyArray.ERROR_NUM;
    }
    return arrayStack.removeElement(--top);
  }

  public void printAll() {
    for (int i = 0; i < top; i++) {
      System.out.println(arrayStack.getElement(i));
    }
  }

  public int getSize() {
    return top;
  }


}
