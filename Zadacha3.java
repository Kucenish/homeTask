/**
 * Created by User on 17.10.2016.
 */
public class Zadacha3 {
   public static int dochod = 10000;

    public static void dochodValue() {
        if (dochod < 0){
            System.out.println("Внимание! Введено отрцательное значение дохода!");
        }
        else if (dochod < 1000){
            System.out.println("Критически малый доход");
        }
        else if (dochod < 5000){
            System.out.println("Средний доход");
        }
        else if (dochod < 100000){
            System.out.println("Высокий доход");
        }
        else {
            System.out.println("Миллионер");
        }
    }
}
