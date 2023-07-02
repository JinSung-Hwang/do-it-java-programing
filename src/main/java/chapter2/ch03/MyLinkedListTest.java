package chapter2.ch03;

public class MyLinkedListTest {

  // LinkedList 특징

  // 동인한 데이터 타입을 순서에 따라 관리하는 자료 구조
  // 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음
  // 자료가 추가 될때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연경함 (정해진 크기가 없음)
  // 연결 리스트의 i번쨰 요소를 찾는게 걸리는 시간은 요소의 개수에 비례: O(n)
  // jdk 클래스: LinkedList
  public static void main(String[] args) {

    MyLinkedList list = new MyLinkedList();
    list.addElement("A");
    list.addElement("B");
    list.addElement("C");
    list.printAll();
    list.insertElement(3, "D");
  }

}
