package behavioral.strategy.adventureCharacter;

public class SwordBehaviour implements WeaponBehaviour {
  @Override
  public void useWeapon() {
    System.out.println("I am using Sword");
  }
}
