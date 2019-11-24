package behavioral.strategy.adventureCharacter;

public class Demo {

  public static void main(String[] args) {
    AdventureCharacter character = new King();
    character.setName("Alexander");
    character.setWeaponBehaviour(new SwordBehaviour());
    character.attack();

    character.setWeaponBehaviour(new KnifeBehaviour());
    character.attack();

    AdventureCharacter character1 = new Knight();
    character1.setName("Wazir");
    character1.setWeaponBehaviour(new BowAndArrow());
    character1.attack();

  }
}
