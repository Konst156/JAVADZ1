// Вывести все простые числа от 1 до 1000 

public class task_02 {
    public static void main(String args[]) {
        boolean flag = true;
        int count = 0;
        for (int i = 2; i < 1001; i++) {
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }    
            if (flag) {
                System.out.println(i);
                count++;
            }
            else {
                flag = true;
            }
            }
        System.out.printf("Количество простых чисел в диапазоне 1 - 1000 = %d", count);    
        }
    }
