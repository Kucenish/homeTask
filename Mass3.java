/**
 * 4. Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 * Created by User on 21.10.2016.
 */
public class Mass3 {

    public static void main(String[] args) {
        System.out.println("Одинадцать первых чисел Фибоначчи:");
        int mass[] = new int[11];
        mass[0] = 1;
        System.out.print(mass[0]+" ");
        mass[1] = 1;
        System.out.print(mass[1]+" ");
        for (int i = 2; i <11; i++){
            mass[i]= mass[i-1]+mass[i-2];
            System.out.print(mass[i]+" ");
        }

    }
}
