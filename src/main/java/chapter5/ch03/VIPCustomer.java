package chapter5.ch03;

public class VIPCustomer extends Customer {
  private int agentId;
  double saledRatio;

  public VIPCustomer(int customerId, String customerName) {
    super(customerId, customerName);
    // super() 여기서 super()를 안써도 precomfile시에 super()를 넣어서 실행함, 즉 상위 클래스를 생성하고 하위 클래스는 생성함
    customerGrade = "VIP";
    this.saledRatio = 0.05;
    bonusRatio = 0.1;

    System.out.println("VIPCustomer(int, string) call");
  }

  public int getAgentId() {
    return agentId;
  }
}
