import java.util.Scanner;
import java.io.IOException;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

/**
 * Seminar1
 */
public class Seminar1 {

        public static void main(String[] args) throws IOException {
            Scanner in = new Scanner(System.in);
            int sum_total = in.nextInt();
            int mult_total = in.nextInt();

            int sum_result = sumTotalAmount(sum_total);
            int mult_resul = multTotalAmount(mult_total);

            System.out.println("Результаты");
            System.out.println(sum_result);
            System.out.println(mult_resul);
           
        }
        
        public static int sumTotalAmount(int value) {
            int result = 0;
            for (int i = 1; i <= value; i++) {
                result += i;
            }
            return result;
        }
        public static int multTotalAmount(int value) {
            int result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            return result;
        }

        
        
}
