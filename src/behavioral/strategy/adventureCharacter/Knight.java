package behavioral.strategy.adventureCharacter;

public class Knight extends AdventureCharacter {

  @Override
  public void attack() {
    System.out.println("Knight " + this.getName() + " is attacking" );
    this.getWeaponBehaviour().useWeapon();
  }}
