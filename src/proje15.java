import java.util.Scanner;

public class proje15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Denklemi girin (örnek: 45 - 40 = x): ");
        String denklem = scanner.nextLine();


        String[] parcalar = denklem.split(" ");


        int xPozisyonu = -1;
        for (int i = 0; i < parcalar.length; i++) {
            if (parcalar[i].equals("x")) {
                xPozisyonu = i;
                break;
            }
        }


        if (xPozisyonu != -1) {
            double sayi1 = Double.parseDouble(parcalar[xPozisyonu - 1]);
            double sayi2 = Double.parseDouble(parcalar[xPozisyonu + 1]);

            String islem = parcalar[xPozisyonu];

            double sonuc = 0;

            switch (islem) {
                case "+":
                    sonuc = sayi1 + sayi2;
                    break;
                case "-":
                    sonuc = sayi1 - sayi2;
                    break;
                case "*":
                    sonuc = sayi1 * sayi2;
                    break;
                case "/":
                    sonuc = sayi1 / sayi2;
                    break;
                default:
                    System.out.println("Geçersiz bir işlem operatörü.");
                    return;
            }

            System.out.println("x = " + sonuc);
        } else {
            System.out.println("Denklemde x ifadesi bulunamadı.");
        }

        scanner.close();
    }
}
