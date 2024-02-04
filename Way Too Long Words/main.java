
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0, count = 0, k = 0;
        String[] coll = new String[n];
        while (i < n) {
            String word = scanner.next().toLowerCase();
            coll[i++] = word;
        }
        if (n <= 100 && n >= 1) {
            String selectedW = null;
            for (k = 0; k < coll.length; k++) {
                selectedW = coll[k];
                if (selectedW.length() <= 10) {
                    System.out.println(selectedW);
                } else if (selectedW.length() <= 100) {
                    char[] check = selectedW.toCharArray();
                    // System.out.println(check);
                    for (int j = 2; j < check.length; j++) {
                        count++;
                    }
                    System.out.println(selectedW.substring(0, 1) + count + selectedW.substring(selectedW.length() - 1));
                    count = 0;
                }
                continue;
            }

        }
        System.exit(0);
    }

}
