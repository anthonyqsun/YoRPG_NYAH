public class Protagonist extends Character {
  protected String name;
  protected String specializeMsg;
  
  public Protagonist() {
    health = 50;
    strength = 10;
    defense = 5;
    attackRating = 1.0;
  }

  public Protagonist(String name) {
    this();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void specialize() {
    return;
  }
  
  public void normalize() {
    return;
  }

}
