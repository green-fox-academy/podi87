
public class Student extends Person {
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  public String getGoal(){
    return "Be a junior software developer";
  }
  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " years old "
            + gender + " form " + previousOrganization + " who skipped "
            + skippedDays + " days from the course already.");
  }
  public void skipDays(int numberOfDays){
    this.skippedDays += numberOfDays;
  }
  public Student(String name, int age, String gender, String previousOrganization){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }
  public Student(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }
}
