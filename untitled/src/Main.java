import java.util.Scanner;

public class Main {
    public static boolean primo() {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int divisor = 2;

        if (num <= 1) {
            return false;
        }
        while (divisor < num) {
            if (num % divisor == 0) {
                return false;

            }
            divisor++;
        }

        return true;
    }
}
