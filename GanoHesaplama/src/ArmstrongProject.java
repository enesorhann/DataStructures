import java.util.Scanner;

public class ArmstrongProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz: "); // 1234 ornegin
        int sayi = sc.nextInt();
        int basamak_sayisi = 0;
        int toplam = 0;
        int gecici_sayi = sayi;
        while (sayi>0){
            sayi /= 10;
            basamak_sayisi++;
        }
        System.out.println("Basamak Sayisi: "+basamak_sayisi);
        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /=10;
            toplam += Math.pow(basamak_degeri,basamak_sayisi);
            System.out.println("Basamak Degeri: "+basamak_degeri);
            System.out.println("Toplam: "+toplam);
            System.out.println("Sayi: "+sayi);
        }
        while(gecici_sayi>0);
        if (toplam==sayi){
            System.out.println("Bu Sayi Bir Armstrong Sayisidir. ");
            }
        else {
            System.out.println("Bu Sayi Bir Armstrong Sayisi Degildir. ");
            }
    }
}
