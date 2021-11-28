public class Goblin extends Monster {
  public Goblin(){
    super();
    attackRating += (Math.random() / 2);
  }
  
  public static String about(){
    return "This little brat is quite weak, but it has a random chance to hit a little harder.";
  }

  public String toString() {
    return "Goblin";
  }
}
