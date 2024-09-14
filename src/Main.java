import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first_name = scan.next();

        System.out.println("Enter your last name: ");
        String last_name = scan.next();


        System.out.println("Enter your age: ");
        int age = scan.nextInt();


        System.out.println("Enter your favourite quote: ");
        String quote = scan.next();
        quote+= scan.nextLine();


        System.out.println("=====================");
        System.out.println("WELCOME "+ first_name);
        System.out.println("Your password is: "+last_name +age);
        System.out.println("You're "+ age + " years old! ");
        System.out.println("favorite quote: " +quote);

    }
}