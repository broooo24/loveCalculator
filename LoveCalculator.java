import java.util.Random;
import java.util.Scanner;

public class LoveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name");
        String firstName = scanner.nextLine();
        System.out.println("name of your love");
        String secondName = scanner.nextLine();
        Random random = new Random();
        int result = random.nextInt(100-1) + 1;

        System.out.println("The chance that you love each other " + result + "%");
    }
}
