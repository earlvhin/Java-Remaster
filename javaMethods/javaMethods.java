import java.io.*;
public class javaMethods {
    // Main Method
    public static void main(String[] args) throws IOException {
        getName();
    }

    // Get Name Method
    public static void getName() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name: ");
        String name = input.readLine();
        greet(name);
    }

    // Greet METHOD
    public static void greet(String name) {
        System.out.println("Hello "+name+"!");
    }
}
