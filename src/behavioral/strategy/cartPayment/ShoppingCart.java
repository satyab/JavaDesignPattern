package behavioral.strategy.cartPayment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  private List<Item> itemList;
  private double totalAmount;

  public ShoppingCart() {
    this.itemList = new ArrayList<>();
    this.totalAmount = 0.0;
  }

  public void addToCart(Item item) {
    this.itemList.add(item);
  }

  public List<Item> getItemList() {
    return itemList;
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  private double calculateTotalAmount() {
    for (Item item : this.itemList) {
      this.totalAmount += item.getPrice();
    }
    return this.totalAmount;
  }

  public void pay(PaymentStrategy paymentStrategy) {
    double amount = calculateTotalAmount();
    paymentStrategy.pay(this.totalAmount);
  }
}
