package chapter7.ch09;

import java.util.HashSet;

public class HashSetTest {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<String>();

    hashSet.add(new String("김유신"));
    hashSet.add(new String("이순신"));
    hashSet.add(new String("홍길동"));
    hashSet.add(new String("강감찬"));
    hashSet.add(new String("강감찬"));

    System.out.println(hashSet); // 출력해보면 중복된 "강감찬"은 1개만 나오고, 입력 순서대로 출력되지 않는다.


  }
}
