package basic;

/*
 - 42 ~ 396사이의 난수를 발생시킨 후
 발생한 난수가 홀수인지 짝수인지의 여부를
 3항 연산식으로 출력해 보세요.
 ex)
 발생한 난수: XX
 3항 연산의 결과: 홀수입니다. or 짝수입니다.
*/

public class ConOperatorQuiz {
    public static void main(String[] args) {
        // 0 + 42 <= num < 355 + 42
        int num = (int) ((Math.random() * 355) + 42);
        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println("발생한 난수: " + num);
        System.out.println("3항 연산의 결과: " + result + "입니다.");
    }
}
