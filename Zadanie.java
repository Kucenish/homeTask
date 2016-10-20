import java.util.Scanner;

public class Zadanie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания");
        int z = in.nextInt();
        switch (z) {
            case 1:
//                Zadacha1 z = new Zadacha1;
//                z.print();
                break;
            case 2:
//                Zadacha2 z2 = new Zadacha2;
//                z2.chet();
                break;
            case 3:
//                Zadacha3 z3 = new Zadacha3;
//                z3.dochodValue();
                break;
            default:
                System.out.println("Введен некорректный номер задания");
        }

    }

}
