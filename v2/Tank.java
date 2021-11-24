public class Tank extends Protagonist{
  protected int defaultDefense;

  public Tank(){
    super();
    health = 100;
    strength = 6;
    defaultDefense = defense;
  }

  public Tank(String name){
    this();
    this.name = name;
  }

  public static String about(){
      return "This class doesn't pack a punch but it sure can take one";
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
