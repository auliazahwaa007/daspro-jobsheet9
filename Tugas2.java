import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Makanan atau minuman yang ingin dipesan : ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[jumlahPesanan];
        int[] harga = new int[jumlahPesanan];
        int total = 0;
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Apa menu Makanan atau Minuman yang ingin anda pesan? : ");
            menu[i] = sc.nextLine();
            System.out.print("Masukkan harga dari pesanan yang anda pilih");
            harga[i] = sc.nextInt();
            sc.nextLine();
            total += harga[i];
        }
        System.out.println("===== PESANAN ANDA =====");
        for (int i = 0; i < jumlahPesanan; i++){
            System.out.println((i+1) + ". " + menu[i] + " dengan harga : " + harga[i]);
        }
        System.out.println("Total harga pesanan anda adalah : " + total);
    }
    
}
