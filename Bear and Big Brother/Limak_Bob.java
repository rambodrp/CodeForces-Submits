import java.util.Scanner;

public class Limak_Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        int count = 0, i = 0, j = 0;
        if (a >= 1 && a <= b && b <= 10) {
            while (a <= b) {
                int bAge = b * 2;
                int aAge = a * 3;
                count++;
                if (aAge > bAge) {
                    System.out.println(count);
                    System.exit(0);
                }
                a = aAge;
                b = bAge;
            }
        }

    }
}
