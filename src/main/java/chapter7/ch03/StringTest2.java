package chapter7.ch03;

public class StringTest2 {
  public static void main(String[] args) {
    String java = new String("java");
    String android = new String("android");
    System.out.println(System.identityHashCode(java));

    java = java.concat(android);
    System.out.println(java);
    System.out.println(System.identityHashCode(java)); // concat으로 java에 android를 연결해서 사용하면 기존 java에 android가 붙을거 같지만 새로운 메모리의 java가 할당되는 것을 확인 할 수 있다.


  }
}
