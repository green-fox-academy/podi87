
public class Mentor extends Person {
  String name;
  int age;
  String gender;
  String level;

  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a "
            + age + " years old " + gender + " " + level + " mentor.");
  }
  public String getGoal(){
    return "Educate brilliant software developers.";
  }
  public Mentor(String name, int age, String gender, String level){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }
  public Mentor(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.level = "intermediate";
  }
}


