package chapter3.ch18;

public class ObjectArrayTest {
  public static void main(String[] args) {

    Book[] library = new Book[5];
    // 배열은 원래 타입의 크기만큼 메모리를 연속해서 할당하게 되는데,
    // 객체 배열은 객체의 시작 주소만 배열에 할당하여 가지고 있게 된다.

    // 객체의 주소가 32비트면 4바이트 64비트이면 8바이트로 할당된다

    library[0] = new Book("태백산맥1", "조정래");
    library[1] = new Book("태백산맥2", "조정래");
    library[2] = new Book("태백산맥3", "조정래");
    library[3] = new Book("태백산맥4", "조정래");
    library[4] = new Book("태백산맥5", "조정래");


    for (Book book: library) {
      book.showBookInfo();
      System.out.println(book);
    }

  }
}
