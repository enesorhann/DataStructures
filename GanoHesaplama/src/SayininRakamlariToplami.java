import java.util.Scanner;

public class SayininRakamlariToplami {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Rakamlarini Toplamak Istediginiz Sayiyi Giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0;
//1234 olsun ornegin
        do {

            toplam += sayi %10;
            sayi /= 10;
        }

        while (sayi>0);
            System.out.println("Rakamlari Toplami: "+toplam);

}}
