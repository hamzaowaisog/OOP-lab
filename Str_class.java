import java.util.*;


public class Str_class {
    public static void main(String[] args) {

        str1 st1 = new str1();
        System.out.println("The text :- " + st1.s1);

        System.out.println();
        System.out.println();

        str2 st2 = new str2();
        System.out.println("The text :- "+ st2.getS2());

        System.out.println();
        System.out.println();

        str3 st3 = new str3("Learning OOP using java as a programming language.. ");
        System.out.println("The text :- " +st3.s3);

    }
}

class str1{
    String s1 = null;
}
class str2{
    Scanner sc = new Scanner(System.in);
    private String s2 ;

    str2 (){
        System.out.println("Enter the text");
        setS2(sc.next());
    }

    public void setS2(String str){
        this.s2 = str;
    }
    public String getS2(){
        return s2;
    }


}
class str3{
     String s3;

    str3 (String s3){
        this.s3 = s3;
    }
}
