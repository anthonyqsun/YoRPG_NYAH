public class Character {
  protected int health;
  protected int strength;
  protected int defense;
  protected double attackRating;
  protected int totalDamage;

  public boolean isAlive() {
    return health > 0;
  }

  public int getDefense() {
    return defense;
  }

  public void lowerHP(int h) {
    health -= h;
  }

  public int attack(Character chara) {
    int damage = (int) (strength*attackRating - chara.defense);
    int modifier = (int) (Math.random()*6) - 3;
    totalDamage = damage + modifier;
    if (totalDamage < 0) {
      totalDamage = 0;
    }
    chara.lowerHP(totalDamage);
    return totalDamage;
  }
}
