package chapter7.ch01;

// java.lang 패키지
// 프로그래밍시 import하지 않아도 자동으로 import됨
// import.java.lang.*;
// 많이 사용하는 기본 클래스들이 속한 패키지
// String, Integer, System ....

// 모든 클래스는 Object클래스를 상속 받는다.
// 모든 클래스의 최상위 클래스이고 모든 클래스는 Object클래스를 상속받는다.
// 또한 Object의 메서드 일부를 재정의 할 수있음  (toString, equals, hashCode 등등)
// 컴파일러가 extends Object를 추가함

class Book extends Object {
  private String title;
  private String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  @Override
  public String toString() {
    return title + "," + author;
  }
}

public class BookTest {
  // JDK에서 만드는 모든 클래스는 Object를 상속을 받는다. 따라서 Object의 메소드를 사용할 수 있다.

  public static void main(String[] args) {
    Book book = new Book("태백산맥", "조정래");
    System.out.println(book.toString()); // 오버라이딩 안했을때 리턴값 "chapter7.ch01.Book@3f0ee7cb" - "클래스이름@주소값(주소값음 16진수로 표현함)"
    // toString은 원래 object의 string representation값을 리턴하도록 되어있다.
    // 이 toString 메서드를 오버라이딩하면서 원하는 스트링값이 리턴 되도록 만드는것이 일반적이다. 보통은 멤버 변수를 스트링값으로 볼 수 있게 리턴한다.
    System.out.println(book); // 참조 변수만 찍어도 toString을 찍는거와 동일하게 값이 나타난다.

    String str = new String("test");
    System.out.println(str); // 값이 바로 나오는 이유는 String클래스에서 toString을 오버라이딩 해두었기 때문이다.

    Integer integer = new Integer(100);
    System.out.println(integer); // 값이 바로 나오는 이유는 Interger클래스에서 toString을 오버라이딩 해두었기 때문이다.
  }

}
