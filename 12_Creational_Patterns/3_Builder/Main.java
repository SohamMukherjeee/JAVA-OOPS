
public class Main {
     public static void main(String[] args) {
        User user= new User.userBuilder()
        .setEmailId("soham@gmail.com")
        .setUserId("USER123")
        .setUserName("Soham")
        .build();
                System.out.println(user);

     }
}
