public class Healer extends Protagonist{

  public Healer(){
    super();
    health += 5;
    specializeMsg = "\nDoth thou wisheth to forsake damage to heal thyself?";
  }

  public Healer(String name){
    this();
    this.name = name;
  }

  public static String about(){
    return "This class isn't the most durable or hardest hitting, but it can heal itself at a cost";
  }

  public int heal(Protagonist chara){
    int healAmt = (int)(Math.random()*10+10);
    chara.health += healAmt;
    return healAmt;
  }

  public void specialize() {
    heal(this);
    System.out.println("Thou hath been blesseth by the grace of the gods with more vitailty.");
    if (health > 55){
      health = 55;
    System.out.println("Hero, thou hath achieveth the maximum amount of health!");
    }
    attackRating = 0.0;
  }

  public void normalize() {
    attackRating = 1.0;
  }
}
