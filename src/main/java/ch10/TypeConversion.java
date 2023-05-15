package ch10;

// 형변환

// 형변환은 묵시적형변환, 명시적형변환 두가지가 있다.

// 묵시적 형변환은 자동적으로 이루어지기때문에 신경쓸 필요없다.
// 묵시적 형변환은 작은수, 정밀한 수에서 큰수, 덜 정밀한 수로 변환될때 일어난다. short => int -> long

// 명시적 형변환은 개발자가 casting연산자를 이용하여 형변환을 진행해야한다.
// 명시적 형변환은 큰수에서 덜 정밀한수에서 작은수, 정밀한 수로 변환될때 해야한다. double -> float

public class TypeConversion {
  public static void main(String[] args) {

    double dNum = 1.2;
    float fNum = 0.9f;

    int iNum1 = (int)dNum + (int)fNum;
    int iNum2 = (int)(dNum + fNum);

    System.out.println(iNum1); // result: 1
    System.out.println(iNum2); // result: 2
    // 서로 결과값이 다르다.

    int num = 1000;
    byte bNum = (byte) num;
    System.out.println(bNum); // result: -24
    // 이렇게 명시적 형변환이 일어날떄는 예상치 못한 값이 들어갈 수 있으니 주의해야한다.


  }
}
