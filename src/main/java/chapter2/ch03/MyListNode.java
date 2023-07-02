package chapter2.ch03;

import javax.swing.plaf.InsetsUIResource;

public class MyListNode {
  private String data;
  public MyListNode next;

  public MyListNode() {
    data = null;
    next = null;
  }

  public MyListNode(String data) {
    this.data = data;
    this.next = null;
  }

  public MyListNode(String data, MyListNode next) {
    this.data = data;
    this.next = next;
  }

  public String getData() {
    return data;
  }
}
