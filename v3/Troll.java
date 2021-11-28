public class Troll extends Monster {
  public Troll(){
    super();
    health = 35;
    defense = 6;
  }
  public static String about(){
    return "This beast ate one too many taco bell meals. It can take a beating on both the toilet and the battlefield.";
  }

  public String toString() {
    return "Troll";
  }
}
