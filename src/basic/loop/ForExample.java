package basic.loop;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = scanner.nextInt();

        int fac = 1;
        for (int i = num; i >= 1; i--) {
            fac *= i;
        }
        System.out.print(num + "! = " + fac);
    }
}
