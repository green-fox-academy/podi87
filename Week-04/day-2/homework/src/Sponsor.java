
public class Sponsor extends Person {
  String name;
  int age;
  String gender;
  String level;
  String company;
  int hiredStudents;

  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a "
            + age + " years old " + gender + " who represents "
            + company + " and hired " + hiredStudents + " students so far.");
  }
  public String getGoal(){
    return "Hire brilliant software developers.";
  }
  public void hire(){
    this.hiredStudents = hiredStudents + 1;
  }
  public Sponsor(String name, int age, String gender, String level){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
  }
  public Sponsor(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
