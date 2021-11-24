public class Character {
  protected int health;
  protected int strength;
  protected int defense;
  protected double attackRating;

  public boolean isAlive() {
    return health > 0;
  }

  public int getDefense() {
    return defense;
  }

  public void lowerHP(int h) {
    health -= h;
  }

  public void attack(Character chara) {
    int damage = (int) (strength*attackRating - chara.defense);
    chara.lowerHP(damage);
  }
}
