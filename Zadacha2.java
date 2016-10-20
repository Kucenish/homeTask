/**
 * Created by User on 17.10.2016.
 */
public class Zadacha2 {
    public static void chet() {
        double n = 375.41678;
        if (n >= 1000 || n < 100) {
            System.out.println("Пременная n имеет недопустимое значение.");
        } else if (n * 100000 % 1 != 0) {
            System.out.println("Пременная n имеет недопустимое значение.");
        } else {
            n = n * 100000;
            int a, b, c, d, e, f, g, h;
            a = (int) n / 10000000;//число сотен
            n -= (a * 10000000);
            b = (int) n / 1000000;//число десятков
            n -= b * 1000000;
            c = (int) n / 100000;//число единиц
            n -= c * 100000;
            d = (int) n / 10000;//число десятых
            n -= d * 10000;
            e = (int) n / 1000;//число сотых
            n -= e * 1000;
            f = (int) n / 100;//число тысячных
            n -= f * 100;
            g = (int) n / 10;//число десятитысячных
            n -= g * 10;
            h = (int) n;//число стотысячных
            System.out.println(a + b - c + d - e + f - g + h);
        }
    }
}