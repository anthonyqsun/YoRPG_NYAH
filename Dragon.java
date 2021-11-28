public class Dragon extends Monster {
  public Dragon(){
    super();
    strength = 20;
  }

  public static String about(){
    return "This fiery beast is one you don't wanna mess with.";
  }

  public String toString() {
    return "Dragon";
  }
}
