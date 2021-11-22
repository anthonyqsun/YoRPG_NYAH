public class Character {
  public int health;
  public int strength;
  public int defense;
  public double attackRating;

  public boolean isAlive() {
    return health > 0;
  }

  public int getDefense() {
    return defense;
  }

  public void lowerHP(int h) {
    health -= h;
  }

  public void attack(Character char) {
    int damage = (int) (strength*attackRating - char.defense);
  }
}
