package behavioral.strategy.adventureCharacter;

public class AxeBehaviour implements WeaponBehaviour {

  @Override
  public void useWeapon() {
    System.out.println("I am using Axe");
  }
}
