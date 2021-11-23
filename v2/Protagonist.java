public class Protagonist extends Character {
  protected String name;

  public Protagonist() {
    health = 50;
    strength = 10;
    defense = 5;
  }

  public Protagonist(String name) {
    this();
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
