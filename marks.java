import java.util.*;

public class marks {
    public static void main(String[] args) {
        float average;
        int total=0,marks_1;
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> marks = new ArrayList<Integer>();

        for (int i=0 ; i<5 ; i++){
            System.out.println("Enter the marks for student "+(i+1));
            marks_1 = sc.nextInt();
            marks.add(marks_1);
            System.out.println();
            total = total + marks_1;
        }
        System.out.println("Display:");
        for(int i : marks){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Average of the student before removing student less than 50 ");

        average = total / marks.size();
        System.out.println("Average "+average );

        marks.removeIf(n->(n<50));
        System.out.println();
        System.out.println("Displaying after removing student less than 50 ");

        for (int i : marks){
            System.out.println(i);
        }
        total = 0;

        for (int i=0;i<marks.size();i++){
            total = total + marks.get(i);

        }
        average = total/marks.size();

        System.out.println();
        System.out.println("New Average ");
        System.out.println(average);

    }
}
