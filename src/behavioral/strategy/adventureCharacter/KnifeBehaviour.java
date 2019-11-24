package behavioral.strategy.adventureCharacter;

public class KnifeBehaviour implements WeaponBehaviour {

  @Override
  public void useWeapon() {
    System.out.println("I am using Knife");
  }
}
