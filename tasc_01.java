// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5
import java.util.Scanner;

public class tasc_01{ 
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int N = input.nextInt();
        input.close();
        int sum = 0;
        int mp = 1;
        for (int i = 1; i < N+1 ; i++) {
            sum = sum + i;
        }
        for (int i = 1; i < N+1 ; i++) {
            mp = mp * i;
        }
        System.out.printf("%d-е треугольное число = %d \n", N, sum);
        System.out.printf("%d! = %d \n", N, mp);
        
        





    }
}