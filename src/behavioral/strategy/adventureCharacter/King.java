package behavioral.strategy.adventureCharacter;

public class King extends AdventureCharacter {

  @Override
  public void attack() {
    System.out.println("King " + this.getName() + " is attacking" );
    this.getWeaponBehaviour().useWeapon();
  }
}
