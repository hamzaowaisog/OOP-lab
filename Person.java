import java.util.*;

public class Person {
    String name;
    int age;
    String nationality;
    String address;
    String cnic;
    boolean rep = false;

    public Person(){
        System.out.println("I am a person");
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name ");
        name = sc.next();
        System.out.println("Enter your age ");
        age = sc.nextInt();
        System.out.println("Enter your nationality ");
        nationality = sc.next();
        System.out.println("Enter your address ");
        address = sc.next();
        System.out.println("Enter cnic number ");
        cnic = sc.next();
        while(rep == false ){
            if (cnic.length()>12 && cnic.length()<14){
                rep = true;
            }
            else{
                System.out.println("Enter coorect 13 digit cnic number ");
                cnic = sc.next();
            }
        }
    }
    public void display(){
        System.out.println("Name : " +name);
        System.out.println("Age : "+age);
        System.out.println("Nationality : "+nationality);
        System.out.println("Address : "+address);
        System.out.println("Cnic : "+cnic);
    }
}
