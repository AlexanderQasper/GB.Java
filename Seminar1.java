// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


public class Seminar1 {
    public static void main(String[] args) throws Exception {
        int result = showTotalAmount(5);
    }
    
    public static int showTotalAmount(int value) {
        int result = 0;
        for (int i = 1; i <= value; i++) {
            result += i;
        }
        
        return result;
    }
}
