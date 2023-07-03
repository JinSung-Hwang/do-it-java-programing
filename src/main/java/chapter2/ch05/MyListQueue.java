package chapter2.ch05;

import chapter2.ch03.MyLinkedList;
import chapter2.ch03.MyListNode;

interface IQueue {
  public void enQueue(String data);
  public String deQueue();
  public void printAll();
}

public class MyListQueue extends MyLinkedList implements IQueue{
  MyListNode front;
  MyListNode rear;

  public MyListQueue() {
    front = null;
    rear = null;
  }

  @Override
  public void enQueue(String data) {
    MyListNode newNode;
    if (isEmpty()) {
      newNode = addElement(data);
      front = newNode;
    } else {
      newNode = addElement(data);
      rear = newNode;
    }
    System.out.println(newNode.getData() + " added");
  }

  @Override
  public String deQueue() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return "";
    }
    String data = front.getData();
    front = front.next;
    if (front == null) {
      rear = null;
    }
    return data;
  }

  @Override
  public void printAll() {
    if(isEmpty()) {
      System.out.println("queue is empty");
      return ;
    }
    MyListNode temp = front;
    while(temp != null) {
      System.out.print(temp.getData() + ",");
      temp = temp.next;
    }
    System.out.println();
  }

  public boolean isEmpty() {
    if (front == null && rear == null) {
      return true;
    } else {
      return false;
    }
  }
}
