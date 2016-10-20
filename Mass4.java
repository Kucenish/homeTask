/**
 * 5. В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 * Created by User on 21.10.2016.
 */
public class Mass4 {
    static int c1 = 0;
    static int c2 = 0;
    static int r = 0;
    static int a = 0;
    static int b = 0;
    static int c = 0;
    static int d = 0;
    static int e = 0;
    static int n = 0;
    
    public static void main(String[] args) {
        for (int i = 1; i < 1000000; i++){
            r =i;
            a = r/100000;
            r -= a*100000;
            b = r/10000;
            r -= b*10000;
            c = r/1000;
            r -= c*1000;
            d = r/100;
            r -= d*100;
            e = r/10;
            r -= e*10;
            c1 = a + b + c;
            c2 = d + e + r;
            if (c1 == c2){
                n += 1;
            }
        }
        System.out.println("В одном рулоне " + n + " счастливых билетов.");
    }
}
