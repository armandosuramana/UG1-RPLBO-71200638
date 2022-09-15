import org.example.makanan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UG3_71200638 {
    public static void main(String[] args) {
        Scanner masukan =new Scanner(System.in);
        makanan makanan = new makanan();

        System.out.println("===Data Product===");
        System.out.println("Masukan data product makanan");
        System.out.println("Nama Makanan");
        makanan.setNama(masukan.nextLine());
        System.out.println("Tanggal Kadaluarsa");
        makanan.setTanggalKadaluarsa(masukan.nextLine());
        System.out.println("Jumalah Kuantity");
        makanan.setKuantity(masukan.nextInt());
        System.out.println("Berat(garam)");
        makanan.setBerat(masukan.nextInt());

        System.out.println("===Data Product===");
        System.out.println("Nama Makanan="+makanan.getNama());
        System.out.println("Tanggal kadaluarsa"+makanan.getBerat());
        System.out.println("jumlah(quantituy)"+makanan.getBerat());
        System.out.println("berat"+makanan.getBerat());


    }

}
