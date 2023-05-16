package chapter3.ch19;

public class TwoDimensionTest {
  public static void main(String[] args) {

    int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}};

    System.out.println(arr.length); // arr.length는 행의 길이
    System.out.println(arr[0].length); // arr[i].length는 i번쨰의 열의 길이

    System.out.println();

    int i, j;
    for(i = 0; i < arr.length; i++) {
      for(j = 0; j <arr[i].length; j++) {
        System.out.println(arr[i][j] + "   ");
      }
      System.out.println();
    }



  }
}
