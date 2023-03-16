public class Human {
  private String name;

  public Human(String name) {
    this.name = name;
  }

  public String getName(){
    return name
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Человек по имени " + name;
  }

  public void greeting() {
    System.out.println("Я родился!");
  }
}