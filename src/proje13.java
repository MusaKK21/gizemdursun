import java.util.Scanner;

public class proje13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. kenarı girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("2. kenarı girin: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("3. kenarı girin: ");
        double kenar3 = scanner.nextDouble();

        if (ucgenOluyorMu(kenar1, kenar2, kenar3)) {
            System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulabilir.");

            if (kenar1 == kenar2 && kenar1 == kenar3) {
                System.out.println("Bu bir eşkenar üçgendir.");
            } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                System.out.println("Bu bir ikizkenar üçgendir.");
            }

            if (dikKenarMi(kenar1, kenar2, kenar3)) {
                System.out.println("Bu bir dik kenar üçgendir.");
            }
        } else {
            System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulamaz.");
        }

        scanner.close();
    }


    private static boolean ucgenOluyorMu(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }


    private static boolean dikKenarMi(double a, double b, double c) {
        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
    }
}
