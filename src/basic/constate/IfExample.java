package basic.constate;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요: ");
        int score = scanner.nextInt();
        System.out.println("score = " + score);


        scanner.close();
    }
}
