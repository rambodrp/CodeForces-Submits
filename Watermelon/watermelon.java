import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if (w >2 && w <= 100) {
            if (w % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
           
        }else{
            System.out.println("NO");
        }
    }
}