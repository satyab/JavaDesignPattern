package behavioral.strategy.cartPayment;

import java.util.Date;

public class CardPayment implements PaymentStrategy {

  private String name;
  private int cardNumber;
  private int cvc;
  private Date expiryDate;

  public CardPayment(String name, int cardNumber, int cvc, Date expiryDate) {
    this.name = name;
    this.cardNumber = cardNumber;
    this.cvc = cvc;
    this.expiryDate = expiryDate;
  }

  @Override
  public void pay(double amount) {
    System.out.println("I am paying with Card");
  }
}
