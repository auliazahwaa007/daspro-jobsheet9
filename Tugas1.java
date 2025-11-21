import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        double rata2, total = 0;
        int nilaiTertinggi = 0, nilaiTerendah = 100;

        for (int i = 0; i < nilaiMahasiswa.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i + 1) + " : ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++){
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
            total += nilaiMahasiswa[i];
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" adalah : "+nilaiMahasiswa[i]);
        }
        rata2 = total / nilaiMahasiswa.length;
        System.out.println("Total rata-rata nilai mahasiswa adalah : " + rata2);
        System.out.println("Nilai tertinggi mahasiswa adalah: " + nilaiTertinggi);
        System.out.println("Nilai terendah mahasiswa adalah: " + nilaiTerendah);
    }   
}
