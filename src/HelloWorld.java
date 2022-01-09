import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = in.nextLine();
		System.out.printf("Result: %s ", text);
        in.close();
    }
}