public class proje8 {
    public static void main(String[] args) {
        int n = 20;


        int[] fibonacciDizisi = new int[n];

        // İlk iki elemanı elle atıyoruz.
        fibonacciDizisi[0] = 0;
        fibonacciDizisi[1] = 1;


        for (int i = 2; i < n; i++) {
            fibonacciDizisi[i] = fibonacciDizisi[i - 1] + fibonacciDizisi[i - 2];
        }


        System.out.println("Fibonacci Serisi (ilk " + n + " sayı):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciDizisi[i] + " ");
        }
    }
}
