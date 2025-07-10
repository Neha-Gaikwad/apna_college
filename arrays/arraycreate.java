import java.util.Scanner;

public class arraycreate {
    public static void main(String[] args) {
        int marks[] = new int[100];
        
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // Input for Physics
        marks[1] = sc.nextInt(); // Input for Chemistry
        marks[2] = sc.nextInt(); // Input for Mathematics
    

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);
        
        marks[2] = 90; // Update the value of marks[2] to 90
        System.out.println("math : " + marks[2]); // Output: math : 90

        int percentage = ( marks [0] + marks[1]+ marks[2]) /3;
        System.out.println("percentage : " + percentage +"%");

    }
}
