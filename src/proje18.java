import java.util.Scanner;

class Hesap {
    private String hesapNo;
    private String sifre;
    private double bakiye;

    public Hesap(String hesapNo, String sifre, double bakiye) {
        this.hesapNo = hesapNo;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public boolean sifreKontrol(String girilenSifre) {
        return sifre.equals(girilenSifre);
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }

    public void paraCek(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye. İşlem gerçekleştirilemedi.");
        }
    }
}

class ATM {
    private Hesap hesap;

    public ATM(Hesap hesap) {
        this.hesap = hesap;
    }

    public void menuGoster() {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\nATM İşlemleri:");
            System.out.println("1. Bakiye Sorgula");
            System.out.println("2. Para Çek");
            System.out.println("3. Para Yatır");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen bir işlem seçin: ");

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    bakiyeSorgula();
                    break;
                case 2:
                    paraCek();
                    break;
                case 3:
                    paraYatir();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz işlem. Tekrar deneyin.");
            }
        } while (secim != 4);
    }

    private void bakiyeSorgula() {
        System.out.println("Hesap Bakiyesi: " + hesap.getBakiye());
    }

    private void paraCek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çekilecek miktarı girin: ");
        double miktar = scanner.nextDouble();
        hesap.paraCek(miktar);
    }

    private void paraYatir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırılacak miktarı girin: ");
        double miktar = scanner.nextDouble();
        hesap.paraYatir(miktar);
    }
}

public class proje18 {
    public static void main(String[] args) {
        Hesap hesap = new Hesap("123456", "1234", 1000.0);
        ATM atm = new ATM(hesap);
        atm.menuGoster();
    }
}

