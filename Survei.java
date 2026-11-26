import java.util.Scanner;

public class Survei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        int[][] hasil = new int[jumlahResponden][jumlahPertanyaan];

        // a. Menyimpan hasil survei
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < jumlahPertanyaan; j++) {
                int nilai;
                do {
                    System.out.print("  Pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();

                    if (nilai < 1 || nilai > 5) {
                        System.out.println("  Nilai harus antara 1 sampai 5!");
                    }
                } while (nilai < 1 || nilai > 5);

                hasil[i][j] = nilai;
            }
        }

        System.out.println("\n=== Rata-rata Setiap Responden ===");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalResponden = 0;

            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalResponden += hasil[i][j];
            }

            System.out.println("Responden ke-" + (i + 1) + ": " + totalResponden / jumlahPertanyaan);
        }

        System.out.println("\n=== Rata-rata Setiap Pertanyaan ===");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalPertanyaan = 0;

            for (int i = 0; i < jumlahResponden; i++) {
                totalPertanyaan += hasil[i][j];
            }

            System.out.println("Pertanyaan " + (j + 1) + ": " + totalPertanyaan / jumlahResponden);
        }

        double totalSemua = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalSemua += hasil[i][j];
            }
        }

        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.println("Rata-rata: " + totalSemua / (jumlahResponden * jumlahPertanyaan));
    }
}