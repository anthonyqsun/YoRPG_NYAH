public class Fighter extends Protagonist {
  protected int defaultDefense;

  public Fighter(){
    super();
    strength = 15;
    defaultDefense = defense;

    specializeMsg = "\nDoth thou wisheth to deal more damage but taketh more in return?";
  }

  public Fighter(String name){
    this();
    this.name = name;
  }

  public static String about(){
    return "This class hits harder, but when it goes down, it stays down.";
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
