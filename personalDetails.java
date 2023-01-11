
public class personalDetails {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("Teo");
        u1.setAge(24);

        u1.print();
    }
}
class User {
    private int age ;
    private String name;

    void setAge(int age1){
        age = age1;
    }
    void setName(String name1){
        name = name1;
    }

    int getAge(){
        return age ;
    }
    String getName(){
        return name;
    }

    void print (){
        System.out.println("My name is "+name+" and I'm "+age+" years old .");
    }
}
