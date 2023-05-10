import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1, number2, total = 1;
        System.out.print("Üssü alınacak sayı: ");
        number1 = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        number2 = input.nextInt();

        for (int i = 1; i <= number2; i++) {
            total *= number1;
        }
        System.out.println("Cevap: " + total);
    }
}

