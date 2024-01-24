import java.util.Scanner;

public class proje17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine().toLowerCase(); // Kullanıcının girdiği kelimeyi küçük harfe çeviriyoruz.

        int sesliHarfSayisi = 0;
        int sessizHarfSayisi = 0;

        for (int i = 0; i < kelime.length(); i++) {
            char harf = kelime.charAt(i);

            // Harfin sesli veya sessiz olduğunu kontrol ediyoruz.
            if (harf >= 'a' && harf <= 'z') {
                if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') {
                    sesliHarfSayisi++;
                } else {
                    sessizHarfSayisi++;
                }
            }
        }

        System.out.println("Sesli harf sayısı: " + sesliHarfSayisi);
        System.out.println("Sessiz harf sayısı: " + sessizHarfSayisi);

        scanner.close();
    }
}
