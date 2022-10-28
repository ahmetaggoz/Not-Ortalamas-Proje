package Giris;
import java.util.Scanner;

public class proje1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Matematik Notunuzu Girin: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Girin: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Girin: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Girin: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Girin: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Girin: ");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);
        boolean durum = sonuc >= 60;
        System.out.println(durum ? "Sınıfı Geçti." : "Sınıfta Kaldı.");

    }
}
