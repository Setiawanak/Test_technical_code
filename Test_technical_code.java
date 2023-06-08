import java.util.*;

public class Test_technical_code {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Deklarasi Variable
        String Pilih = "", numberString = "", nambahEnol = "", hasilString = "";
        int angka = 0, x = 0, y = 0, z = 0, pilihanmenu = 0;
        boolean prima = true;

        do {
            do {
                System.out.println("\n###########################################");
                System.out.println("     Selamat Datang di Generate Angka");
                System.out.println(" Dibuat Oleh [ Ade Kukuh Setiawan]");
                System.out.println("#############################################");

                System.out.println("\nPilihanMenu : ");
                System.out.println("1. Generate Segitiga ");
                System.out.println("2. Generate Bilangan Ganjil ");
                System.out.println("3. Generate Bilangan Prima ");
                System.out.println("4. Keluar ");
                System.out.print("Silahkan Pilih Menu : ");
                pilihanmenu = input.nextInt(); // PILIH MENU

                if (pilihanmenu != 1 && pilihanmenu != 2 && pilihanmenu != 3)
                    System.out.println("Menu " + pilihanmenu + " tidak ada!");
            } while (pilihanmenu != 1 && pilihanmenu != 2 && pilihanmenu != 3 && pilihanmenu != 4); // PENGULANGAN MENU

            System.out.println("-------------------------------------------\n");
            switch (pilihanmenu) {
                case 1: // Generate angka Segitiga
                    System.out.print("Silahkan Input biar dibikin segitiga: ");
                    z = input.nextInt();

                    // Pindahin dulu ke String biar nambah angka atau huruf biar lebih mudah (0-9
                    // atau a-z)
                    numberString = Integer.toString(z);
                    for (int w = 0; w < numberString.length(); w++) {
                        char ch = numberString.charAt(w); // ngambil data dari si w dari si string
                        nambahEnol = "0".repeat(w + 1); // ikutin angka setiap segitiga Contoh : 10 , 200 , 3000 , 4000
                                                        // , 50000
                        hasilString = ch + nambahEnol; // Ambil dari input + ambil angka 0 setiap segitiga
                        System.out.print(hasilString);
                    }

                    System.out.println("\n-------------------------------------------\n");
                    break;

                case 2: // Generate Bilangan Ganjil
                    System.out.print("Silahkan Input Angka bilangan ganjil : ");
                    x = input.nextInt();
                    // Pemilihan dengan if-else
                    if (x % 2 == 1) { // Memeriksa bilangan ganjil
                        System.out.println(x + " Adalah bilangan ganjil");
                    } else if (x % 2 == 0) { // Memeriksa bilangan genap
                        System.out.println(x + " Bukan bilangan ganjil");
                    }

                    System.out.println("\n-------------------------------------------\n");
                    break;

                case 3: // Generate Bilangan Prima
                    System.out.print("Silahkan Input Angka bilangan prima : ");
                    y = input.nextInt();

                    if (y == 0 || y == 1) {
                        prima = false;
                    } else {
                        for (int i = 2; i <= y / 2; i++) {
                            if (y % 1 == 0) {
                                prima = false;
                                break;
                            }
                        }
                    }

                    if (prima) { // Memeriksa bilangan prima
                        System.out.println(y + " Adalah bilangan prima");
                    } else if (x % 2 == 0) { // Memeriksa bilangan prima
                        System.out.println(y + " Bukan bilangan prima");
                    }

                    System.out.println("\n-------------------------------------------\n");
                    break;

                case 4: // KELUAR
                    System.out.println("\n Terimakasih telah menggunakan program ini !");
                    System.exit(0);
                    break;

            }
        } while (pilihanmenu != 4);
    }
}