package behavioral.strategy.adventureCharacter;

public class BowAndArrow implements WeaponBehaviour {

  @Override
  public void useWeapon() {
    System.out.println("I am using Bow and Arrow");
  }
}
