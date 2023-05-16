package chapter3.ch17;

// 배열 선언
// int[] arr1 = new int[10];
// int arr2[] = new int[10];

// 배열 초기화
// int[] numbers = new int[] {10, 20, 30}
// int[] numbers = { 10, 20, 30 }
// int[] ids;
// ids = new int[] {10, 20, 30};


public class ArrayTest {
  public static void main(String[] args) {

    int[] arr1 = new int[10];
    int arr2[] = new int[10];

    int[] numbers = {1, 2, 3, 4, 5};

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    int[] ids;
    ids = new int[]{10, 20, 30};

    for (int id: ids) {
      System.out.println(id);
    }

    int[] arr = new int[10];
    for(int i = 0, num=1; i<arr.length; i++, num++) {
      arr[i] = num;
    }

    int total = 0;
    for(int i = 0; i< arr.length; i++ ) {
      total += arr[i];
    }
    System.out.println(total);

    int count = 0;
    double[] dArr = new double[5];
    dArr[0] = 1.1; count++;
    dArr[1] = 2.1; count++;
    dArr[2] = 3.1; count++;
    // 초기화 안한 배열은 int는 0, double은 0.0, 객체는 null로 초기화 된다.
    double dTotal = 1;

    for(int i = 0 ; i < count ; i++) {
      dTotal *= dArr[i];
    }
    System.out.println(dTotal);

    char[] alphabets = new char[26];
    char ch = 'A';

    for(int i = 0; i< 26; i++ ) {
      alphabets[i] = ch++;
    }

    for (char alpha: alphabets) {
      System.out.print(alpha + "    ");
    }

  }
}
