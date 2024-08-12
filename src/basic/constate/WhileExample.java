package basic.constate;

public class WhileExample {
    public static void main(String[] args) {
        // 47~150의 정수 중 8의 배수만 가로로 출력해 보세요.
        // (47부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)
        int i = 48;
        while (i <= 150) {
            if (i % 8 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        // 0 ~ 100까지의 정수 중 4의 배수이면서 8의 배수는 아닌 수를 가로로 출력해 보세요.
        i = 0;
        while (i <= 100) {
            if (i % 4 == 0 && i % 8 != 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 0 ~ 30000까지의 정수 중 258의 배수의 개수를 출력.
        i = 0;
        int count = 0;
        while (i <= 30000) {
            if (i % 258 == 0) {
                count++;
            }
            i++;
        }
        System.out.println("258의 배수의 개수는 " + count);;

        /*
        1000의 약수의 개수를 구하세요.
        0부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
        그랬을 때 나누어 떨어지는 애가 약수입니다.
         */
        i = 1;
        count = 0;
        while (i <= 1000) {
            if (100 % i == 0) {
                count++;
            }
            i++;
        }
        System.out.println("1000의 약수의 개수는 " + count);
    }
}
