import java.util.Scanner;

public class TANK1 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            tank t1 = new tank(10);
            t1.print();
            System.out.println();
            while(t1.capacity != 0){
                System.out.println();
                System.out.println("Enter the new capacity ");

                t1.setCapacity(sc.nextInt());
                t1.print();

            }

            t1.finalize();
            t1 = null;
            System.gc();



        }

    }

    class tank {
        int capacity ;

        void setCapacity(int capacity1){
            this.capacity = capacity1;
        }
        void print(){
            System.out.println("The capacity is " + capacity);
        }

        tank (int capacity){
            this.capacity = capacity;
        }

        public void finalize(){
            System.out.println("Object is destroyed ");
        }


    }

