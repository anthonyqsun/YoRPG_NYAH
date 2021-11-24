public class Tank extends Protagonist{
  protected int defaultDefense;

  public Tank(){
    super();
    health = 100;
    strength = 6;
    defaultDefense = defense;
  }
  
  public void specialize() {
    attackRating = 0.7;
    defense = defaultDefense + 4;
  }

  public void normalize() {
    attackRating = 1.0;
    defense = defaultDefense;
  }
}
