import java.util.Random;
import java.util.Scanner;

/**
 * 3. Создать двумерный массив из случайных чисел так чтобы размер внутреннего массива был случайным. Вывести массив на экран.
 * Created by User on 20.10.2016.
 */
public class Mass2 {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите размер внешнего массива");
            int z = in.nextInt();

            Random random = new Random();
            int r = random.nextInt(10);
            int mass[][] = new int[z][r];

            System.out.println("Массив:");

            for (int i = 0; i < z; i++) {
                for (int j = 0; j < r; j++) {
                    mass[i][j] = random.nextInt(100);
                    System.out.print(mass[i][j]+ " ");
                }
                System.out.println();
            }
    }
}
