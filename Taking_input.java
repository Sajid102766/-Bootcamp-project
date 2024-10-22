import java.util.Scanner;

public class Taking_input{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Asking for different types of input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Reads a full line of text
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Reads an integer
        
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();  // Reads a floating point number
        
        // Displaying the information back to the user
        System.out.println("\nInformation you entered:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        
        // Close the scanner
        scanner.close();
    }
}
