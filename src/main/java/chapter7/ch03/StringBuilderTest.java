package chapter7.ch03;

public class StringBuilderTest {
  public static void main(String[] args) {
    String java = new String("java");
    String android = new String("android");

    StringBuilder builder = new StringBuilder(java); // StringBuilder안에 AbstractStringBuilder를 확인하면 value에 final이 없는 것을 확인할 수 있다.
    System.out.println(System.identityHashCode(builder));

    builder.append(android);
    System.out.println(builder.toString());
    System.out.println(System.identityHashCode(builder)); // 10번 라인과 같은 address값이 나온다. 반면에 String은 concat을 하면 다른 address가 반환된다.

    java = builder.toString();
  }

  // StringBulider와 StringBuffer차이
  //   StringBuilder는 여러 멀티스레드에서 하나의 리소스를 공유하면 오류가 생길 수도 있다.
  //   StringBuffer는 멀티스레드에서도 사용하면 안전한다.
  //   그러면 StringBuffer를 사용하면 좋은가?? 꼭 그렇지 않다.
  //   StringBuffer는 lock을 걸고 해제하는 오버해드가 걸리기때문에 성능은 좋지 못할 수도 있다.
  //   그렇기 때문에 멀티쓰레드를 사용하는지 않하는지를 확인하고 상황에 맞춰서 builder든 buffer든 사용하면 된다.

//  public static String getBlockOfHtml() {
    // text block (자바 13에서 프리뷰 되고 15에서 정식 발표됨)
    // """ """ 사이에 문자를 이어서 만들 수 있음
    // html, json문자열을 만드는데 유용하게 사용할 수 있음
//    return """
//            <html>
//            <body>
//            <span>example text</span>
//            </body>
//            </html>
//           """;
//  }
}
