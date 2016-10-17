/*
2) В переменной n хранится вещественное трёхзначное число с 2-мя знаками после запятой. Создайте программу, вычисляющую и выводящую на экран max и min цифру числа n.
 */
public class Homework3_2 {
    public static void main(String[] args){
        double n = 123.69;
        if (n >= 1000 || n < 100){
            System.out.println("Пременная n имеет недопустимое значение.");
        } else if (n *100 % 1 != 0){
            System.out.println("Пременная n имеет недопустимое значение.");
        } else {
            n=n*100;
            int a, b, c, d, e;
            a = (int)n/10000;
            n -=(a*10000);
            b =(int)n/1000;
            n -= b*1000;
            c = (int)n/100;
            n -=c*100;
            d =(int)n/10;
            n -= d*10;
            e = (int)n/1;
            System.out.println(Math.max(a, Math.max(b, Math.max(c, Math.max(d, e)))));
        }
        }
}
