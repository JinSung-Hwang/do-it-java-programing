package chapter7.ch05;


// 무엇이든 담을 수 있는 제네릭 프로그래밍`

// 제네릭 자료형 정의
//    데이터 타입(data type)을 일반화(generalize)하는 것
//    실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식
//    컬렉션 프레임워크에서 많이 사용되고 있음

//    T(type parameter): 자료형 매개변수
//    GenericPrinter: 제네릭 자료형
//    E: element, K: key, V: value 등 여러 알파벳을 의미에 따라 사용 가능

//    다이아몬드 연산자 <>
//        ArrayList list = new ArrayList<>(); // 다이아몬드 연산자 내부에서 자료형은 생략 가능함
//        제네릭에서 자료형 추론(자바 10부터)
public class GenericPrinterTest {

  public static void main(String[] args) {
    GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
    powderPrinter.setMaterial(new Powder());
    System.out.println(powderPrinter);

    GenericPrinter<Plastic> plasticPrint = new GenericPrinter<>();
    plasticPrint.setMaterial(new Plastic());
    System.out.println(plasticPrint);
  }

}
