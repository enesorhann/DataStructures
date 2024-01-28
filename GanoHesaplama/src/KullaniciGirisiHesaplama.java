import java.util.Scanner;

public class KullaniciGirisiHesaplama {
    public static void main(String[] args) {
        int giris_hakki = 3;
        String  sys_kullanici_adi = "xtrytroll";
        String sys_parola = "X.019365";
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Kullanici Adiniz: ");
            String kullanici_adi = sc.nextLine();
            System.out.print("Parolaniz: ");
            String parola = sc.nextLine();
            if (kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hosgeldiniz:)");
                break;
            }
            else if (kullanici_adi.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                System.out.println("Parolaniz Yanlis! ");
                System.out.println();
                giris_hakki-=1;
            }
            else if (!kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Kullanici Adiniz Yanlis! ");
                System.out.println();
                giris_hakki-=1;
            }
            else if (!kullanici_adi.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                System.out.println("Kullanici Adiniz ve Parolaniz Yanlis! ");
                System.out.println();
                giris_hakki-=1;
            }
            if (giris_hakki==0){
                System.out.println("Giris Hakkiniz Bitmistir Lutfen Daha Sonra Tekrar Deneyiniz!! ");
                System.out.println();
                break;
            }

        }




    }
}
