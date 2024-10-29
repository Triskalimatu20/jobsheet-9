import java.util.Scanner;

public class TugasPencarianMenuKafe19 {
    public static void main(String[] args) {
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cariMakanan = scanner.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMakanan)) { 
                ditemukan = true;
                break; 
            }
        }

        if (ditemukan) {
            System.out.println("Makanan/Minuman " + cariMakanan + " tersedia di menu.");
        } else {
            System.out.println("Makanan/Minuman " + cariMakanan + " tidak ditemukan di menu.");
        }
        
    }
}
