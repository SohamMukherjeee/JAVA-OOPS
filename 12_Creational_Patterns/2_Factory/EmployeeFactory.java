
public class EmployeeFactory {
     // get the employee type
     public static Employee getEmployee(String empType){
        if(empType.equalsIgnoreCase("AndroidDev")){
            return new AndroidDev();
        }else if(empType.equalsIgnoreCase("WebDev")){
            return new WebDev();
        }else{
            return null;
        }
     }
}
