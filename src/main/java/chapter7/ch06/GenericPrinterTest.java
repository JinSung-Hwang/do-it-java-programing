package chapter7.ch06;


public class GenericPrinterTest {

  public static void main(String[] args) {
    GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
    powderPrinter.setMaterial(new Powder());
    powderPrinter.doPrinting();
    System.out.println(powderPrinter);

    GenericPrinter<Plastic> plasticPrint = new GenericPrinter<>();
    plasticPrint.setMaterial(new Plastic());
    plasticPrint.doPrinting();
    System.out.println(plasticPrint);

//    GenericPrinter<Water> waterPrinter = new GenericPrinter<>(); // GenericPrinter에서 "<T extends Material>" extends로 T를 Material로 두었기때문에 water는 들어갈수 없다.
  }

}
