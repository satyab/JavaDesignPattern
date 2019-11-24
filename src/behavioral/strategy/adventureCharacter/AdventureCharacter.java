package behavioral.strategy.adventureCharacter;

public abstract class AdventureCharacter {

  private String name;
  private WeaponBehaviour weaponBehaviour;

  public WeaponBehaviour getWeaponBehaviour() {
    return weaponBehaviour;
  }

  public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
    this.weaponBehaviour = weaponBehaviour;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void attack();
}
