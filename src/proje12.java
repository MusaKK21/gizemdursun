public class proje12 {
    public static void main(String[] args) {
        String kelime = "Programlama";

        for (int i = 0; i < kelime.length(); i++) {
            for (int j = i; j < kelime.length(); j++) {
                System.out.print(kelime.charAt(j));
            }
            for (int k = 0; k < i; k++) {
                System.out.print(kelime.charAt(k));
            }
            System.out.println();
        }
    }
}
