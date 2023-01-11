import java.util.ArrayList;
import java.util.Iterator;

public class practice {
    public static void main(String[] args) {
        int arr [] =  {1,2,3,4,5};


        for(int no :arr){
            System.out.println(no);
        }

        ArrayList <String> list  = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");

        Iterator it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
