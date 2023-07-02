package chapter2.ch02;

public class MyArrayTest {

  // 배열 특징
//   동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
//   정해진 크기가 있음
//   요소의 추가, 제거시 다른 요소들의 이동이 필요함
//   배열의 i번쨰 요소를 찾는 인덱스 연산이 빠름 (랜덤IO)
//   jdk 클래스: ArrayList, Vector
  public static void main(String[] args) {
    MyArray array = new MyArray();
    array.addElement(10);
    array.addElement(20);
    array.addElement(30);
    array.insertElement(1, 50);
    array.printAll();
    System.out.println("=========");

    array.removeElement(1);
    array.printAll();
    System.out.println("=========");

    array.addElement(70);
    array.printAll();
    System.out.println("=========");
    array.removeElement(1);
    array.printAll();

    System.out.println("=========");
    System.out.println(array.getElement(2));
  }
}
