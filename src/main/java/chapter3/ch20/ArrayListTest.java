package chapter3.ch20;

import java.util.ArrayList;
import chapter3.ch18.Book;

public class ArrayListTest {
  public static void main(String[] args) {

    ArrayList<Book> list = new ArrayList<Book>();
    list.add(new Book("태백 산맥1", "조정래"));
    list.add(new Book("태백 산맥2", "조정래"));
    list.add(new Book("태백 산맥3", "조정래"));
    list.add(new Book("태백 산맥4", "조정래"));
    list.add(new Book("태백 산맥5", "조정래"));

    for(int i = 0; i < list.size(); i++) {
      list.get(i).showBookInfo();
    }
  }
}
