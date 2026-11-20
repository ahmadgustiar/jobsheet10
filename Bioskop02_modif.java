
public class Bioskop02_modif {

    public static void main(String[] args) {

        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

        //tambahan (soal no 4)
        // System.out.println(penonton.length);      // tambahan
        // System.out.println(penonton[0].length);   // tambahan
        // System.out.println(penonton[1].length);   // tambahan
        // System.out.println(penonton[2].length);   // tambahan
        // System.out.println(penonton[3].length);   // tambahan


        //tambahan 2 (soal no 5)
        // for (int i = 0; i < penonton.length; i++) {
        //     System.out.println("Panjang baris ke-" + (i + 1) + ": " + penonton[i].length);
        // }


        // //tambahan 3(soal no 6)
        // System.out.println(penonton.length);
        // for (String[] barisPenonton : penonton) {
        //     System.out.println("Panjang baris: " + barisPenonton.length);
        // }


        // // tambahan 4 (soal no 7)
        // System.out.println("Penonton pada baris ke-3: ");

        // for (int i = 0; i < penonton[2].length; i++) {
        //     System.out.println(penonton[2][i]);
        // }

        
        
        // //Tambahan 5(soal no 8)
        // System.out.println("Penonton pada baris ke-3: ");
        
        // for (String i : penonton[2]) {
        //     System.out.println(i);
        // }


        // tambahan 6 (soal no 9)
        for (int i = 0; i < penonton.length; i++) {
        System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
}
    }
}
