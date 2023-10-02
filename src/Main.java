import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your party affiliation? (Respond with D,R, or I)");
        String affiliation = scan.nextLine();
        if (affiliation.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (affiliation.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (affiliation.equalsIgnoreCase("I"))
            System.out.println("You get an Independent Man");
        else
            System.out.println("You have entered an invalid affiliation");
    }
}