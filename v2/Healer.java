public class Healer extends Protagonist{

  public Healer(){
    super();
  }

  public int heal(Protagonist chara){
    int healAmt = (int)(Math.random()*10+10);
    chara.health += healAmt;
    return healAmt;
  }
  
  public void specialize() {
    heal(this);
    if (health > 50){
      health = 50;
    System.out.println("Hero, thou hath achieveth the maximum amount of health!");
    }
    attackRating = 0.0;
  }

  public void normalize() {
    attackRating = 1.0;
  }
}
