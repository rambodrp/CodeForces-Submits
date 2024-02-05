//package Domino piling;

import java.util.Arrays;
import java.util.Scanner;

public class domino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt(), N = scanner.nextInt();
        int result = (M * N) / 2;
        System.out.println(result);
    }
}
