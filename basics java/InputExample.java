import java.util.Scanner; // Importing the Scanner class
 class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // Reading a line of input
        System.out.println("Hello, " + name + "!");
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt(); // Reading an integer
        System.out.println("You are " + age + " years old.");
    }
}
