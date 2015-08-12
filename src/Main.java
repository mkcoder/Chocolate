import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, and welcome to the chocolate factory!");
        System.out.println("Choose your chocolate below and start eating the endless amount of chocolate!");
        System.out.println("1. White chocolate");
        System.out.println("2. Milk chocolate");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        IChocolate chocalate = ChocolateFactory.getChocolate(getChocolate(userChoice));
        while ( userChoice != 5 ) {
            System.out.println("1. Eat");
            System.out.println("2. Chew");
            System.out.println("3. Swallow");
            System.out.println("4. Next");
            userChoice = scanner.nextInt();
            chocalate.doSomething(userChoice);
        }
    }

    private static String getChocolate(int userChoice) {
        switch (userChoice) {
            case 1:
                return "white";
            case 2:
                return "milk";
            default:
                return "";
        }
    }
}
