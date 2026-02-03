abstract class Employee {
 int id;
 Employee(int id){
    this.id=id;
 }
 abstract double calculateSalary();
}
interface BonusEligible {
    double calculateBonus();
}
class Manager extends Employee implements BonusEligible{
   Manager(int id){
    super(id);
   }
   public double calculateSalary(){
    return 2300.0;
   }
   public double calculateBonus(){
    return calculateSalary()*0.20;
   }

 }
public class Question3 {
    public static void main(String[] args) {
        Employee obj=new Manager(100);
        System.out.println(obj.calculateSalary());
        System.out.println(((BonusEligible)obj).calculateBonus());

    }
}
