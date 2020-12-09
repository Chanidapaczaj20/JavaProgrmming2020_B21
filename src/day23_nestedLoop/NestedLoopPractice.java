package day23_nestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {


        for (int j = 1; j <= 15; j++) {
            System.out.print("\t\t\t\t");
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=================================================");
        for (int j = 15; j >= 1; j--) {
            System.out.print("\t\t\t\t");
            for (int i = j; i >= 1; i--) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}


