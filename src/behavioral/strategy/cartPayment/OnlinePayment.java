package behavioral.strategy.cartPayment;

public class OnlinePayment implements PaymentStrategy {

  private String bankName;
  private String accountNumber;
  private String password;

  public OnlinePayment(String bankName, String accountNumber, String password) {
    this.bankName = bankName;
    this.accountNumber = accountNumber;
    this.password = password;

  }

  @Override
  public void pay(double amount) {
    System.out.println("I am paying online");
  }
}
