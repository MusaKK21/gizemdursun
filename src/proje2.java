import java.util.Scanner;

public class proje2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        if (isPalindrom(kelime)) {
            System.out.println(kelime + " bir palindrom kelime.");
        } else {
            System.out.println(kelime + " bir palindrom kelime değil.");
        }

        scanner.close();
    }


    private static boolean isPalindrom(String kelime) {

        String tersKelime = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }


        return kelime.equals(tersKelime);
    }
}
