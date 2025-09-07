import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите первое число: ");
            int a = in.nextInt();
            System.out.println("Введите второе число: ");
            int b = in.nextInt();
            System.out.println("""
                    Выберите операцию:
                    1. рекурсия
                    2. цикл
                    3. деление
                    4. массивы
                    5. BigInteger
                    6. Побитовые операции
                    7. Логарифм
                    """);
            int n = in.nextInt();
            switch (n) {
                case 1: System.out.println(rec(a, b));break;
                case 2: System.out.println(cycle(a, b));break;
                case 3: System.out.println(div(a, b));break;
                case 4: System.out.println(arrs(a, b));break;
                case 5: System.out.println(bigint(a, b));break;
                case 6: System.out.println(bits(a, b));break;
                case 7: System.out.println(log(a, b));break;
                default: break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите корректные числа");
        }


    }

    public static int rec(int a, int b){
        if(b > 0){
            return a + rec(a,b-1);
        }
        else if (b < 0) {
            return -a + rec(a, b + 1);
        }
        else
            return 0;
    }

    public static int cycle(int a, int b){
        int sum = 0;
        if(b > 0){
            for(int i = 1; i <= b; i++){
                sum+=a;
            }
            return sum;
        }
        else if (b < 0) {
            for(int i = 0; i > b; i--){
                sum-=a;
            }
            return sum;
        }
        else
            return 0;
    }

    public static int div(int a, int b){
        return (int) (a / (1.0 /b));
    }

    public static int arrs(int a, int b) {
        int[] arr = new int[Math.abs(b)];
        Arrays.fill(arr, Math.abs(a));
        return Arrays.stream(arr).sum() * ((a < 0) ^ (b < 0) ? -1 : 1);
    }

    public static int bigint(int a, int b) {
        return BigInteger.valueOf(a)
                .multiply(BigInteger.valueOf(b))
                .intValue();
    }

    public static int bits(int a, int b) {
        int sum = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                sum = add(sum, a);
            }
            a <<= 1;
            b >>>= 1;
        }
        return sum;
    }

    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    public static int log(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int sign = ((a < 0) ^ (b < 0)) ? -1 : 1;
        double temp = Math.exp(Math.log(Math.abs(a)) + Math.log(Math.abs(b)));
        return (int)Math.round(temp) * sign;

    }

}
/*
закинуть код в гит, а гит в веже
 */