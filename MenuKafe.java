import java.util.Scanner;

public class MenuKafe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        System.out.println("=== MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine().trim();  

        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) { 
                ditemukan = true;
                posisi = i;
                break; 
            }
        }

        if (ditemukan) {
            System.out.println("Makanan \"" + cari + "\" tersedia di menu (urutan ke-" + (posisi + 1) + ").");
        } else {
            System.out.println("Maaf, makanan \"" + cari + "\" tidak ada di menu.");
        }

        sc.close();
    }
}

