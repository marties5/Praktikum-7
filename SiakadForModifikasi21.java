import java.util.Scanner;

public class SiakadForModifikasi21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int JumlahLulus = 0, JumlahTidakLulus = 0;
        double tidakLulus = 60.0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= tidakLulus) {
                JumlahLulus++;
            } else {
                JumlahTidakLulus++;
            }
        }
        input.close();
        System.out.println("\n-------------------------------------------\n");
        System.out.println("Nilai tertinggi \t\t : " + tertinggi);
        System.out.println("Nilai terendah \t\t\t : " + terendah);
        System.out.println("Mahasiswa yang Lulus \t\t : " + JumlahLulus);
        System.out.println("Mahasiswa yang tidak Lulus \t : " + JumlahTidakLulus);
    }
}