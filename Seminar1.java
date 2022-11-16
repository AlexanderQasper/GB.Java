import java.io.Console;
import java.io.IOException;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

/**
 * Seminar1
 */
public class Seminar1 {

        public static void main(String[] args) throws IOException {
            int result = showTotalAmount(15);
            System.out.println(result);
        }
        
        public static int showTotalAmount(int value) {
            int result = 0;
            for (int i = 1; i <= value; i++) {
                result += i;
            }
            return result;
        }
        
}
