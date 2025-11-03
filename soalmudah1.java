import java.util.Scanner;

public class soalmudah1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int hasil = 0;

       System.out.println("Selamat Datang di ekspedisi kami !");
       System.out.println("Berat Barang (kg):");
       int berat = input.nextInt();
       System.out.println("Jarak tempuh pengiriman (km):");
       int jarak = input.nextInt();
       System.out.println("Masukkan Panjang barang");
       int panjang = input.nextInt();
       System.out.println("Masukkan Lebar barang");
       int Lebar = input.nextInt();
       System.out.println ("Masukkan Tinggi barang");
       int Tinggi = input.nextInt();

       if (jarak < 10 || jarak == 10){
            hasil += 4250* berat;
        } else if (jarak > 10)  {
            hasil +=6000* berat;
        }
        int  volume = panjang * Lebar * Tinggi;
        if (volume > 100){
            hasil += 50000;
        }
System.out.println("Total biaya pengiriman : Rp" + hasil);
    }

}

    