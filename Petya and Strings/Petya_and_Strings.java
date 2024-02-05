//package Petya and Strings;

import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next().toLowerCase();
        String second = scanner.next().toLowerCase();
        int result = first.compareTo(second);
        if(result > 0){
            System.out.println(1);
        }else if(result < 0){
            System.out.println(-1);
        }else {
           System.out.println(0);
        }
    }
}
