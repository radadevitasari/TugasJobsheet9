import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;
        int tertinggi, terendah;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        tertinggi = nilai[0];
        terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        double rata2 = (double) total / nilai.length;

        System.out.println("\n=== HASIL DATA NILAI MAHASISWA ===");
        System.out.print("Semua nilai: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\nNilai rata-rata  : " + rata2);
        System.out.println("Nilai tertinggi  : " + tertinggi);
        System.out.println("Nilai terendah   : " + terendah);

        sc.close();
    }
}
    
