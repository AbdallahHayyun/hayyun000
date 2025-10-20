import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dua bilangan
        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = input.nextDouble();

        double hasilTambah = bil1 + bil2;
        double hasilKurang = bil1 - bil2;

        // Output hasil
        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Penjumlahan: " + bil1 + " + " + bil2 + " = " + hasilTambah);
        System.out.println("Pengurangan: " + bil1 + " - " + bil2 + " = " + hasilKurang);

        input.close();
    }
}
