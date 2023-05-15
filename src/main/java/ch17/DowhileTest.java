package ch17;

import java.util.Scanner;

public class DowhileTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input;
    int sum = 0; // 초기화를 안하면 밑에서 input값을 더해야하는데 sum에 가비지값이 들어있으면 정확한 값이 안되기때문에 컴파일단계에서 오류가나며, 여기서 먼저 초기화를 해줘야한다.
    do {
      System.out.println("값을 입력해주세요! (0이면 합산 결과가 나옵니다.)");
      input = scanner.nextInt();
      sum += input;
    } while (input != 0);
    System.out.println(sum);
  }
}
