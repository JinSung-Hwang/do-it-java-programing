package chapter5.ch04;

public class VIPCustomer extends Customer {
  private int agentId;
  double saledRatio;


  public VIPCustomer() {
    super();
    // super() 여기서 super()를 안써도 precomfile시에 super()를 넣어서 실행함, 즉 상위 클래스를 생성하고 하위 클래스는 생성함
    customerGrade = "VIP";
    this.saledRatio = 0.1;
    bonusRatio = 0.05;
  }

  public VIPCustomer(int customerId, String customerName) {
    super(customerId, customerName);
    // super() 여기서 super()를 안써도 precomfile시에 super()를 넣어서 실행함, 즉 상위 클래스를 생성하고 하위 클래스는 생성함
    customerGrade = "VIP";
    this.saledRatio = 0.05;
    bonusRatio = 0.1;

    System.out.println("VIPCustomer(int, string) call");
  }


  // 애노테이션
  // 애노테이션은 원래 주석이라는 의미
  // 컴파일러에게 특별한 정보를 제공해주는 역할

  // @override: 재정의된 메서드라는 정보 제공
  // @fuctionalinterface: 함수형 인터페이스라는 정보 제공
  // @deprecated: 이후 버전에서 사용되지 않을 수 있는 변수, 메서드에 사용됨
  // @suppresswarnings: 특정 경고가 나타자지 않도록 함, @supresswarnings('deprecation')는 @deprecated가 나타나지 않도록함
  @Override
  public int calcPrice(int price) {
    bonusPoint += price * bonusRatio;
     return price - (int) (price * saledRatio);
  }

  public int getAgentId() {
    return agentId;
  }

  @Override
  public String toString() {
    return super.toString() + "상담원 아이디는 " + agentId;
  }
}
