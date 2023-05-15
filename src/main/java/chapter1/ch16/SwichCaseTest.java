package chapter1.ch16;

import java.util.Scanner;

public class SwichCaseTest {
  public static void main(String[] args) {
    int month;
    int day;

    System.out.println("달을 입력해주세요");
    Scanner scanner = new Scanner(System.in);
    month = scanner.nextInt();

    switch (month) { // case문에 숫자 뿐만 아니라 문자로 할수도 있다.
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        day = 31;
        break; // note: break;문을 안쓰면 밑에 케이스도 실행이된다.
      case 2:
        day = 28;
        break;
      case 4: case 6: case 11:
        day = 30;
        break;
      default:
        day = 0;
        System.out.println("error");
    }
    System.out.println(month + "월은 " + day + "일 까지 있습니다.");

  }
}
