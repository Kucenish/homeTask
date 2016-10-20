import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by User on 20.10.2016.
 * Напишите программу, печатающую количество максимальных элементов непустого массива, в которой используется только один цикл.
 */
public class Mass {
    static int max =0;
    static int d = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int z = in.nextInt();
        int mass[] = new int[z];

        for( int i = 0; i < z; i++){
            Random random = new Random();
            mass[i] = random.nextInt(100);
        }

//        int mass[] = {7, 7, 7, 7 ,7 ,5};
//        int z = mass.length;
        System.out.println("Массив:");
        for(int i=0; i < z; i++){
            if (mass[i] == max ) {
                max = mass[i];
                d +=1;
            }
            else if(mass[i] > max){
                max = mass[i];
                d = 0;
                d +=1;
            }
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        System.out.println("Количество максимальных элементов массива: "+ d);
        System.out.println("Значение максимального элемента/элементов массива: "+ max);
    }
}
