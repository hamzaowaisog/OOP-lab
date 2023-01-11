import java.util.*;
public class array_list {
    public static void main(String[] args) {
        ArrayList <String> language = new ArrayList<String>();

        language.add("JAVA");
        language.add("C++");
        language.add("Python");
        language.add("SQL");
        language.add("Pascal");

        System.out.println("Printing of the array list");

        for(String s : language){
            System.out.println(s);
        }
        language.set(2,"JAVASCRIPT");

        System.out.println();
        System.out.println("New List");
        System.out.println();

        for (String s : language){
            System.out.println(s);
        }
        language.remove(language.size()-1);
        System.out.println();

        System.out.println("New list after removing");

        for(String s : language){
            System.out.println(s);
        }
        }
    }



