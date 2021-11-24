public class Healer extends Protagonist{

  public Healer(){
    super();
    health += 5;
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
