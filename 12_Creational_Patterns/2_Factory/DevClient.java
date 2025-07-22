 
public class DevClient {
    public static void main(String[] args) {
        Employee employee=EmployeeFactory.getEmployee("WebDev");
        int salary=employee.salary();
        System.out.println("salary "+salary);
    }
}
