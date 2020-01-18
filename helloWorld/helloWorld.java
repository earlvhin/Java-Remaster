import java.io.*;
public class helloWorld {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Hello! What is your name? ");
        System.out.println("Hello " + input.readLine() + "!");
    }
}
