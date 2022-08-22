import java.util.Scanner;

public class MenghitungJumlahAngka {
    public static void main(String[] args) {
        System.out.println("masukan angka");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int angka = scanner.nextInt();
            String huruf = Integer.toString(angka);
            System.out.println(huruf);
        }
        String contoh = "  Hello word 123 dan 456";
        char[] karakter = contoh.toCharArray();
        StringBuilder hasil = new StringBuilder();
        for(char c : karakter){
            if(Character.isDigit(c)){
                hasil.append(c);
            }
        }
        System.out.println(hasil);
    }
}
