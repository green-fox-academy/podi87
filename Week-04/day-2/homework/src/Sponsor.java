
public class Sponsor extends Person {

  String company;
  int hiredStudents;
  @Override
  public void introduce(){
    System.out.println("Hi, I'm " + this.getName() + ", a "
            + this.getAge() + " years old " + this.getGender() + " who represents "
            + company + " and hired " + hiredStudents + " students so far.");
  }
  @Override
  public void getGoal(){
    System.out.println("My goal is: Hire brilliant software developers.");
  }
  public void hire(){
    this.hiredStudents = hiredStudents + 1;
  }
  public Sponsor(String name, int age, String gender, String company){
    super(name, age, gender);
    this.company = company;
  }
  public Sponsor(){
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
