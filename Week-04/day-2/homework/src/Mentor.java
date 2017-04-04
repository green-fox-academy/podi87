
public class Mentor extends Person {

  String level;
  @Override
  public void introduce(){
    System.out.println("Hi, I'm " + this.getName() + ", a "
            + this.getAge() + " years old " + this.getGender() + " " + level + " mentor.");
  }
  @Override
  public void getGoal(){
    System.out.println("My goal is: Educate brilliant software developers.");
  }
  public Mentor(String name, int age, String gender, String level){
    super(name, age, gender);
    this.level = level;
  }
  public Mentor(){
    super();
    this.level = "intermediate";
  }
}


