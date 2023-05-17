package chapter5.ch02;

public class VIPCustomer extends Customer {
  private int agentId;
  double saledRatio;

  public VIPCustomer() {
    customerGrade = "VIP";
    this.saledRatio = 0.05;
    bonusRatio = 0.1;
  }

  public int getAgentId() {
    return agentId;
  }
}
