class User{
    int id;
    String email;
    User(int id,String email){
      this.id=id;
      this.email=email;
    }
    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        User user=(User)o;
        return user.id==id && user.email==email;
    }
     @Override
     public int hashCode(){
        return id;
     }
}
public class Question {
    public static void main(String[] args) {
        User u1=new User(101, "soham");
        User u2=new User(101, "soham");
        System.out.println(u1.equals(u2));
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());


    }
}
