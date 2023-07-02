package chapter2.ch03;

import javax.swing.plaf.IconUIResource;

public class MyLinkedList {

  private MyListNode head;
  int count;


  public MyLinkedList() {
    head = null;
    count = 0;
  }

  public MyListNode addElement(String data) {
    MyListNode newNode;
    if (head == null) {
      newNode = new MyListNode(data);
      head = newNode;
    } else {
      newNode = new MyListNode(data);
      MyListNode tempNode = head;
      while (tempNode.next != null) { // 다음이 없을때 까지 next를 이동한다.
        tempNode = tempNode.next;
      }
      tempNode.next = newNode;
    }
    count++;
    return newNode;
  }

  public MyListNode insertElement(int position, String data) {
    int i;
    MyListNode tempNode = head;
    MyListNode newNode = new MyListNode(data);

    if (position <0 || position > count) {
      System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는" + count + "개 입니다.");
      return null;
    }

    if(position ==0) {
      newNode.next = head;
      head = newNode;
    } else {
      MyListNode preNode = null;
      for (i = 0; i< position; i++) {
        preNode = tempNode;
        tempNode = tempNode.next;
      }
      newNode.next = preNode.next;
      preNode.next = newNode;
    }
    count++;
    return newNode;
  }

  public MyListNode removeElement(int position) {
    int i;
    MyListNode tempNode = head;
    if(position<0 || position >= count) {
      System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는" + count +"개 입니다.");
      return null;
    }

    if(position ==0) {
      head = tempNode.next;
    }
    else {
      MyListNode preNode = null;
      for(i =0; i<position; i++) {
        preNode = tempNode;
        tempNode = tempNode.next;
      }
      preNode.next = tempNode.next;

    }
    count--;
    System.out.println("삭제 되었습니다.");
    return tempNode;
  }

  public MyListNode getNode(int position) {
    int i;
    MyListNode tempNode = head;
    if(position >= count) {
      System.out.println("검색 위치 오류입니다.");
      return null;
    }

    if(position == 0) {
      return head;
    }

    for(i=0; i < position; i++) {
      tempNode = tempNode.next;
    }
    return tempNode;
  }

  public void removeAll() {
    head = null;
    count = 0;
  }

  public int getSize() {
    return count;
  }


  public void printAll() {
    MyListNode myListNode = head;
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < count; i++) {
      stringBuilder.append(myListNode.getData());
      if (i < count - 1) {
        stringBuilder.append("->");
      }
      myListNode = myListNode.next;
    }
    System.out.println(stringBuilder.toString());
  }
}
