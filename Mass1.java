import java.util.Random;
import java.util.Scanner;

/**
 * 2. Напишите программу, печатает массив, затем инвертирует (то есть меняет местами первый элемент с последним, второй — с предпоследним и т.д.), и вновь печатает.
 * Created by User on 20.10.2016.
 */
public class Mass1 {
    static int m = 0;
    static int x = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int z = in.nextInt();
        int mass[] = new int[z];
        System.out.println("Массив:");
        for( int i = 0; i < z; i++){
            Random random = new Random();
            mass[i] = random.nextInt(100);
            System.out.print(mass[i]+ " ");
        }
        x = z -1;

        for(int i=0; i < z/2; i++){
            m = mass[i];
        mass[i] = mass[x];
            mass[x] = m;
            x -= 1;
        }
        System.out.println();
        System.out.println("Инвертированный массив:");
        for(int i=0; i < z; i++){
            System.out.print(mass[i]+ " ");
        }
    }
}
