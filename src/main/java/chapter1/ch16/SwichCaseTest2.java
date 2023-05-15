package chapter1.ch16;

import java.util.Scanner;

// jdk 14 이상부터 실행이 가능하다.

//public class SwichCaseTest2 {
//  public static void main(String[] args) {
//    int month;
//    int day;
//
//    System.out.println("달을 입력해주세요");
//    Scanner scanner = new Scanner(System.in);
//    month = scanner.nextInt();
//
//    int day = switch (month) { // case문에 숫자 뿐만 아니라 문자로 할수도 있다.
//      case 1, 3, 5, 7, 8, 10, 12 -> {
//        yield 31;
//      } case 2 -> {
//        yield = 28;
//      } case 4, 6, 11 -> {
//        yield 30;
//      } default -> {
//        System.out.println("error");
//        yield 0;
//      }
//    };
//    System.out.println(month + "월은 " + day + "일 까지 있습니다.");
//
//  }
//}
