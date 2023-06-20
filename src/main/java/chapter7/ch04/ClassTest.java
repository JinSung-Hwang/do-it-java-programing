package chapter7.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
  // 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됨(바이트 코드는 .class라는 확장자를 갖는다.)
  //    (이 바이트 코드안에는 클래스의 생성자, 메서드, 변수, 어떤 패키지를 임포트하는지, 클래스 이름이 무엇인지 등등이 모두 적혀있다.)
  // "Class 클래스"는 컴파일된 class파일을(바이트 코드)을 읽어서 "동적 로드"하거나 바이트 코드 안에있는 "class파일의 정보를 가져오는 메서드"를 제공한다.
  // 즉, class들의 모든 정보를 가져올 수 있는 "Class 클래스"인 것이다.

  // 동적 로드 하는 이유?
  //   동적 로딩을 하는 이유는 컴파일 하는 타입에 데이터 타입을 지정할 수 없을때,
  //   가령 DB라이브러리를 로딩할때는 환경에 따라서 DB라이브러리가 다를때 동적 로딩을 사용할 수 있다.

  // 동적 로드 하는 방법은?
  //   Class.forName("클래스 이름")메서드로 클래스를 동적으로 로드할 수 있다.
  //   동적 로드 이후에 여러 메서드를 이용하여 .class(바이트코드)안에 있는 데이터를 가져올 수 있다.

  public static void main(String[] args) throws ClassNotFoundException {
    Class c = Class.forName("java.lang.String");
    // 이름이 틀려도 컴파일 에러가 나지 않는다. 따라서 문자열을 쓸때는 주의해야한다.
    System.out.println(c.getName());

    Constructor<String>[] cons = c.getConstructors(); // 클래스의 생성자들을 조회해옴
    for(Constructor con: cons) {
      System.out.println(con);
    }

    System.out.println("===============");

    Method[] methods = c.getMethods(); // 메서드의 목록을 조회해옴
    for (Method m: methods) {
      System.out.println(m);
    }

  }
}
