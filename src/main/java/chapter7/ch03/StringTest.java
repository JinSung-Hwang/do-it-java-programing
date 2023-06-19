package chapter7.ch03;

public class StringTest {
  public static void main(String[] args) {
    String str1 = new String("abc");
    String str2 = new String("abc");
    System.out.println(str1 == str2);

    String str3 = "abc";
    String str4 = "abc"; // String이 특별한 경우가 아니면 상수풀에 있는 값을 가져다가 쓰는것이 메모리 낭비를 줄 일 수 있다.
    // String은 불변(immutable)이다. String의 내부 코드를 보면 value가 final로 선언되어있다.
    System.out.println(str3 == str4);


  }
}
