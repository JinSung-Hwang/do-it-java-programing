package chapter3.ch14;

public class Employee {

  private static int serialNumber = 1000;
  private int employeeId;
  private String employeeName;
  private String department;

  public Employee() {
    this.employeeId = ++serialNumber;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public static int getSerialNumber() {
    int i = 0; // 지역 변수는 사용할 수 있다.
//    this.employeeName = "gee"; // 이 라인이 사용못하는 이유는 static 메소드에서는 멤버 변수를 사용할 수 없기 때문이다.
    // 멤버변수를 사용하려면 객체가 생성되어야하는데 static 메소드는 객체 생성하기 이전에 사용될수 있기때문에 멤버변수를 사용할 수 없다.
    return serialNumber;
  }
}
