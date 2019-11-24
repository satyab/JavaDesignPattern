package behavioral.strategy.cartPayment;

import java.util.Date;

public class ShoppingClient {
  public static void main(String[] args) {

    ShoppingCart cart = new ShoppingCart();

    cart.addToCart(new Item(123, 100.00));
    cart.addToCart(new Item(456, 200.00));

    cart.pay(new CardPayment("Satyajit", 1234, 376, new Date()));
  }
}
