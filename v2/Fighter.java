public class Fighter extends Protagonist {
  protected int defaultDefense;
  
  public Fighter(){
    super();
    strength = 15;
    defaultDefense = defense;
  }
  public void specialize() {
    attackRating = 1.3;
    defense = defaultDefense - 2;
  }

  public void normalize() {
    attackRating = 1.0;
    defense = defaultDefense;
  }
}
