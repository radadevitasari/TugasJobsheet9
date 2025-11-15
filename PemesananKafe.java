import java.util.Scanner;

public class PemesananKafe {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        double total = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Nama makanan/minuman : ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Harga : Rp ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 

            total += hargaPesanan[i];
        }

        System.out.println("\n=== DAFTAR PESANAN ANDA ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("-----------------------------");
        System.out.println("Total biaya pesanan: Rp " + total);

        sc.close();
    }
}
