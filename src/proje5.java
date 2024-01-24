import java.util.Scanner;

public class proje5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("5 basamaklı pozitif bir sayı girin: ");
        int sayi = scanner.nextInt();


        if (sayi >= 10000 && sayi <= 99999) {
            int birler = sayi % 10;
            int onlar = (sayi / 10) % 10;
            int yuzler = (sayi / 100) % 10;
            int binler = (sayi / 1000) % 10;
            int onbinler = sayi / 10000;

            System.out.println("On binler basamağı: " + onbinler);
            System.out.println("Binler basamağı: " + binler);
            System.out.println("Yüzler basamağı: " + yuzler);
            System.out.println("Onlar basamağı: " + onlar);
            System.out.println("Birler basamağı: " + birler);
        } else {
            System.out.println("Girilen sayı 5 basamaklı değil.");
        }

        scanner.close();
    }
}
