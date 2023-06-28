package chapter2.ch02;

// 배열 특징
//   동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
//   정해진 크기가 있음
//   요소의 추가, 제거시 다른 요소들의 이동이 필요함
//   배열의 i번쨰 요소를 찾는 인덱스 연산이 빠름 (랜덤IO)
//   jdk 클래스: ArrayList, Vector

public class MyArray {

  int[] intArr;
  int count;

  public int ARRAY_CAPACITY;
  public static final int ERROR_NUM = -999999999;

  public MyArray() {
    count = 0;
    ARRAY_CAPACITY = 10;
    intArr = new int[ARRAY_CAPACITY];
  }

  public MyArray(int size) {
    count = 0;
    ARRAY_CAPACITY = size;
    intArr = new int[size];
  }

  public int getSize() {
    return count;
  }

  public Boolean isEmpty() {
    if(count == 0) {
      return true;
    } else {
      return false;
    }
  }

  public int getElement(int position) {
    if (position < 0 || position > count - 1) {
      System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
      return ERROR_NUM;
    } else {
      return intArr[position];
    }
  }

  public void addElement(int num) {
    if (count >= ARRAY_CAPACITY) {
      System.out.println("메모리 공간이 부족합니다");
      return;
    } else {
      intArr[count++] = num;
    }
  }

  public void insertElement(int position, int num) {
    if (count >= ARRAY_CAPACITY) {
      System.out.println("메모리 공간이 부족합니다");
      return;
    }
    if (position < 0 || position > count - 1) {
      System.out.println("삽입 위치 오류입니다.");
      return;
    }

    for(int i = count - 1 ; i>= position; i--) {
      intArr[i+1] = intArr[i];
    }
    intArr[position] = num;
    count++;
  }

  public int removeElement(int position) {
    if (isEmpty()) {
      System.out.println("배열이 비어있습니다.");
      return ERROR_NUM;
    }
    if (position < 0 || position > count - 1) {
      System.out.println("해당 위치에서 배열을 제거할 수 없습니다.");
      return ERROR_NUM;
    }

    int result = intArr[position];

    for(int i = position; i < count; i++ ) {
      intArr[i] = intArr[i+1];
    }
    count--;
    return result;
  }

  public void printAll() {
    if (count == 0) {
      System.out.println("출력할 내용이 없습니다.");
      return ;
    }
    for (int i =0; i<count; i++) {
      System.out.println(intArr[i]);
    }
  }

}
