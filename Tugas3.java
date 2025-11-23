import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     String[] menu = {"Mie Ayam", "Ayam Geprek", "Mixue", "Mochi", "Teh Tarik", "Buncis", "es teh", "es Jeruk"};

     System.out.println("----------MENU----------");
     System.out.println("------------------------");
     System.out.println("---------MAKANAN--------");
     System.out.println("1. buncis  2. Mie Ayam  3. Ayam Geprek");
     System.out.println("---------MINUMAN--------");
     System.out.println("4. Teh Tarik  5. es Teh  6. es Jeruk");
     System.out.println("-----MAKANAN PENUTUP-----");
     System.out.println("7. Mixue  8. Mochi");

     System.out.print("Masukkan menu yang ingin anda pesan : ");
     String pesanan = sc.nextLine();

     for (String tmp:menu) {
        if (tmp.equalsIgnoreCase(pesanan)) {
            System.out.println("Menu " + pesanan + " tersedia!");
            break;
        } else {
             System.out.println("Maaf untuk menu " + pesanan + " tidak tersedia!");
             break;
        }
     }
    }
}
