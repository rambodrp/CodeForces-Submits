
//package Team;
import java.util.Arrays;
import java.util.Scanner;

public class taem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0, j = 0, solve = 0;
        int petya, vasya, tonya;

        if (n >= 1 && n <= 1000) {
            for (i = 0; i < n; i++) {
                petya = scanner.nextInt();
                vasya = scanner.nextInt();
                tonya = scanner.nextInt();
                if ((petya + vasya + tonya) >= 2) {
                    solve++;
                }
            }
        }
        System.out.println(solve);

    }
}
