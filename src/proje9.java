import java.util.Scanner;

public class proje9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ondalık sayı girin: ");
        int ondalikSayi = scanner.nextInt();

        String binarySayi = decimalToBinary(ondalikSayi);

        System.out.println("Binary karşılığı: " + binarySayi);

        scanner.close();
    }


    private static String decimalToBinary(int ondalikSayi) {
        StringBuilder binary = new StringBuilder();

        while (ondalikSayi > 0) {
            int kalan = ondalikSayi % 2;
            binary.insert(0, kalan);
            ondalikSayi /= 2;
        }

        return binary.toString();
    }
}
